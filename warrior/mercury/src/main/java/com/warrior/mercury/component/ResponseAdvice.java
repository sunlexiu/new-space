package com.warrior.mercury.component;

import com.warrior.mercury.common.ResponseWrapper;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/12 22:06
 */
@ControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        // 仅处理json返回格式的
        return !Objects.isNull(returnType.getMethodAnnotation(ResponseBody.class))
                || !Objects.isNull(returnType.getMethod().getDeclaringClass().getAnnotation(RestController.class));
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType,
                                  MediaType selectedContentType, Class selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof ResponseWrapper) {
            ResponseWrapper wrapper = (ResponseWrapper) body;
            int code = wrapper.getCode();
            if (code != 0) {
                response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return body;
        }

        return ResponseWrapper.success(body);
    }
}
