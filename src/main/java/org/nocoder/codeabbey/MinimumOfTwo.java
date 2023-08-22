package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/min-of-two--zh
 *
 * @author yangjl
 * @date 2021-11-25
 */
public class MinimumOfTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int min;
            if (a > b) {
                min = b;
            } else {
                min = a;
            }
            sb.append(min).append(" ");
        }
        System.out.println(sb);
        input.close();
    }
}
