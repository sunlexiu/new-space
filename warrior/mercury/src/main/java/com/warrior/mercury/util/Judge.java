package com.warrior.mercury.util;

import org.apache.ibatis.type.Alias;

import java.util.Collection;
import java.util.Map;

/**
 * 供mybatis标签if判断使用
 *
 * @author:       Charon
 * @create:       2020/6/20 17:18
 */
@Alias("judge")
public class Judge {

    /**
     * 判断对象是否是空对象, 不仅仅包含null, 其他的空字符串, 空集合, 空数组等等
     *
     * @param o
     * @return
     */
    public static boolean isEmpty(Object o) {
        if (o == null) {
            return true;
        }

        if (o instanceof String) {
            return ((String) o).trim().isEmpty();
        }

        if (o instanceof Collection<?>) {
            return ((Collection<?>) o).isEmpty();
        }

        if (o.getClass().isArray()) {
            return ((Object[])o).length == 0;
        }

        if (o instanceof Map<?, ?>) {
            return ((Map<?, ?>) o).isEmpty();
        }

        return false;
    }


    /**
     * 判断对象是否是非空对象, 不仅仅是非null, 其他的非空字符串, 非空集合, 非空数组等等
     *
     * @param o
     * @return
     */
    public static boolean isNotEmpty(Object o) {
        return !isEmpty(o);
    }
}
