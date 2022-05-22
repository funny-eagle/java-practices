package org.nocoder.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 字符串和日期相互转换
 */
public class DateFormatter {
    public static void main(String[] args) {
        // 将日期格式转换为字符串
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(df.format(LocalDate.now()));

        // 将字符串转解析为日期格式
        System.out.println(LocalDate.parse("2022-05-22", df));

        // 将日期时间格式转换为字符串，不含时区信息
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
        System.out.println(LocalDateTime.now().format(dtf));
        System.out.println(ZonedDateTime.now().format(dtf));
    }
}
