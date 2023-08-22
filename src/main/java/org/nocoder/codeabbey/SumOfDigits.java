package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/sum-of-digits
 *
 * @author yangjl
 * @date 2023/8/21 15:23
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int d = input.nextInt() * input.nextInt() + input.nextInt();
            int sum = 0;
            while (d != 0) {
                int r = d / 10; // 商
                int y = d % 10; // 余数
                d = r; // 商作为下一次的被除数
                sum += y;// 将每次得到的余数相加
            }
            sb.append(sum).append(" ");
        }
        System.out.println(sb);
        input.close();
    }
}
