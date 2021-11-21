package org.nocoder.time;

/**
 * 通过System.currentTimeMillis()得到当前北京时间
 *
 * @author jason
 * @date 18/3/24.
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        // 获取自1970年1月1日 0:00:00 至当前时刻的毫秒数,格林威治时间
        long totalMilliseconds = System.currentTimeMillis();

        // 将总毫秒数除以1000 得到总秒数 totalSeconds
        long totalSeconds = totalMilliseconds / 1000;

        // 将总秒数%60得到当前的秒数
        long currentSecond = totalSeconds % 60;

        // 将总秒数除以60得到总分钟数
        long totalMinutes = totalSeconds / 60;

        // 将总分钟数%60 得到当前分钟数
        long currentMinute = totalMinutes % 60;

        // 将总分钟数除以60 得到总小时数
        long totalHours = totalMinutes / 60;

        // 将总小时数除以24, 得到当前小时数, 北京时间比格林威治时间快8个小时
        long currentHour = totalHours % 24 + 8;

        System.out.println("现在是北京时间:" + currentHour + ":" + currentMinute + ":" + currentSecond);

    }
}
