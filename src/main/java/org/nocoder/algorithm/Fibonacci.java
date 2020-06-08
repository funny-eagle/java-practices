package org.nocoder.algorithm;

/**
 * 要求输入一个整数n，请输出斐波那契数列的第n项（从0开始，第0项为0）。
 * 斐波那契数列:数列的后一项等于前两项的和
 * 0, 1, 1, 2, 3, 5, 8
 *
 * @author jason
 * @date 2019/5/17.
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        int a = 0, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}
