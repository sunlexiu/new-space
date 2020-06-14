package com.warrior.mercury.common.exception;

/**
 * @author:       Charon
 * @create:       2020/6/12 12:01
 */
public class BusinessException extends RuntimeException {

    private int code;

    private String msg;

    public BusinessException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(BusinessCode businessCode) {
        this.code = businessCode.getCode();
        this.msg = businessCode.getMsg();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
