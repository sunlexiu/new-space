package com.warrior.mercury.component;

import com.warrior.mercury.common.ResponseWrapper;
import com.warrior.mercury.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:       Charon
 * @create:       2020/6/12 9:23
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseWrapper DefaultExceptionHandler(Exception e) {
        LOG.error("msg:", e);
        if (e instanceof BusinessException) {
            BusinessException ex = (BusinessException) e;
            return ResponseWrapper.fail(ex.getCode(), ex.getMsg());
        }

        return ResponseWrapper.fail(500, "操作失败");
    }

}
