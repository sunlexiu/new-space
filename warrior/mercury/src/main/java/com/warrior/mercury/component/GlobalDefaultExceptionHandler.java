package com.warrior.mercury.component;

import com.warrior.mercury.common.ResponseWrapper;
import com.warrior.mercury.common.exception.BusinessCode;
import com.warrior.mercury.common.exception.BusinessException;
import org.apache.commons.lang3.exception.ExceptionUtils;
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
        if (e instanceof BusinessException) {
            BusinessException ex = (BusinessException) e;
            LOG.error(ex.getMsg());
            return ResponseWrapper.fail(ex.getCode(), ex.getMsg());
        }

        LOG.error(ExceptionUtils.getStackTrace(e));
        return ResponseWrapper.wrap(BusinessCode.SYSTEM_ERROR);
    }

}
