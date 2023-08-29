package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/median-of-three--zh
 *
 * @author yangjl
 * @date 2023/8/22 14:38
 */
public class MedianOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int mid = 0;
            if ((a > b && a < c) || (a > c && a < b)) {
                mid = a;
            } else if ((b > a && b < c) || (b > c && b < a)) {
                mid = b;
            } else {
                mid = c;
            }
            sb.append(mid).append(" ");
        }
        System.out.println(sb);
        input.close();
    }
}
