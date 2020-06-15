package com.warrior.mercury.common.exception;

import java.util.Optional;

/**
 * @author:       Charon
 * @create:       2020/6/12 19:09
 */
public enum BusinessCode {

    /**
     * 成功
     */
    OK(0, "成功"),

    /**
     * 系统错误
     */
    SYSTEM_ERROR(500, "系统错误!"),



    /***********************业务相关代码************************/


    /**
     * 数据不存在
     */
    DATA_NOT_EXIST(1001, "数据不存在")

    ;

    private int code;

    private String msg;

    BusinessCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    /**
     * 根据状态码查找
     *
     * @param code
     * @return
     */
    public static BusinessCode getEnumByCode(int code) {
        for (BusinessCode value : BusinessCode.values()) {
            if (code == value.code) {
                return value;
            }
        }
        return null;
    }

    /**
     * 根据状态码获取提示信息
     *
     * @param code
     * @return
     */
    public static String getMessageByCode(int code) {
        return Optional.ofNullable(getEnumByCode(code)).map(BusinessCode::getMsg).orElse(null);
    }

}
