package com.warrior.mercury.common;

import static com.warrior.mercury.common.exception.BusinessCode.OK;

/**
 * @author:       Charon
 * @create:       2020/6/12 9:05
 */
public class ResponseWrapper {

    private final int code;

    private final Object data;

    private final String message;

    private ResponseWrapper(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static ResponseWrapper success(Object data) {
        return success(OK.getCode(), data, OK.getMsg());
    }

    public static ResponseWrapper success(int code, Object data, String message) {
        return new ResponseWrapper(code, data, message);
    }

    public static ResponseWrapper fail(int code, String message) {
        return new ResponseWrapper(code, null, message);
    }

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }
}
