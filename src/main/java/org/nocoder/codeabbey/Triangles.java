package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/triangles--zh
 *
 * @author yangjl
 * @date 2023/8/21 17:18
 */
public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
