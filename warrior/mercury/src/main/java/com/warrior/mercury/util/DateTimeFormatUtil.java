package com.warrior.mercury.util;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * @author:       Charon
 * @create:       2020/6/17 11:26
 */
public class DateTimeFormatUtil {

    /**
     * 获取格式化的时间字符串
     *
     * @param date 时间
     * @param format 格式
     * @return
     */
    public static String format(Date date, FormatEnum format) {
        DateTime time = new DateTime(date);
        return time.toString(format.getFormat());
    }

    /**
     * 获取当前时间的格式化字符串
     *
     * @param format 格式
     * @return
     */
    public static String formatNow(FormatEnum format) {
        DateTime time = new DateTime(new Date());
        return time.toString(format.getFormat());
    }


    public enum FormatEnum {

        DATE("YYYY-MM-dd"),

        DATE_TIME("YYYY-MM-dd HH:mm:ss");

        private String format;

        FormatEnum(String format) {
            this.format = format;
        }

        public String getFormat() {
            return format;
        }
    }
}
