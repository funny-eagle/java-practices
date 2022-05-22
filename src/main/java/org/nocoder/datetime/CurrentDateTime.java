package org.nocoder.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 查看当天的日期或时间
 */
public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
    }
}
