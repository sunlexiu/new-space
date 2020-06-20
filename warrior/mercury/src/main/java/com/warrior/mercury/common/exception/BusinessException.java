package com.warrior.mercury.common.exception;

/**
 * @author:       Charon
 * @create:       2020/6/12 12:01
 */
public class BusinessException extends RuntimeException {

    private int code;

    private String msg;

    private String description;

    public BusinessException(int code, String msg) {
        this(code, msg, null);
    }

    public BusinessException(int code, String msg, String description) {
        this.code = code;
        this.msg = msg;
        this.description = description;
    }

    public BusinessException(BusinessCode businessCode) {
        this(businessCode.getCode(), businessCode.getMsg());
    }

    public BusinessException(BusinessCode businessCode, String description) {
        this(businessCode.getCode(), businessCode.getMsg(), description);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
