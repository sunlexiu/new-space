package com.warrior.mercury.common.exception;

import java.util.Optional;

/**
 * @author:       Charon
 * @create:       2020/6/12 19:09
 */
public enum BusinessCode {

    /***********************系统相关代码************************/

    OK(0, "成功"),

    SYSTEM_ERROR(500, "系统错误!"),

    DATA_NOT_EXIST(1001, "数据不存在"),

    DATA_REPEAT(1002, "数据重复"),

    PARAM_ERROR(1003, "参数错误")

    /***********************业务相关代码************************/





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
