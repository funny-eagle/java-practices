package org.nocoder.utils;

/**
 * 计算间隔期后是周几
 *
 * @author jason
 * @date 18/3/24.
 */
public class ComputeWeek {
    public static void main(String[] args) {
        computeWeek(2, 100);
        computeWeek(6, 5);
    }

    /**
     * 计算间隔期后是周几
     *
     * @param today    今天
     * @param interval 间隔期
     */
    public static void computeWeek(int today, int interval) {
        System.out.println((today + interval) % 7);
    }

}
