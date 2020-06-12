package com.warrior.mercury.util;

/**
 * @author:       Charon
 * @create:       2020/6/12 12:36
 */
public class SqlExecuteUtil {

    /**
     * 处理模糊查询的字段
     *
     * @param property
     * @return
     */
    public static String like(String property) {
        return "%" + property + "%";
    }
}
