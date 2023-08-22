package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/rounding--zh
 *
 * @author yangjl
 * @date 2023/8/18 14:01
 */
public class Rounding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(Math.round((float) input.nextInt() / input.nextInt())).append(" ");
        }

        System.out.println(sb);
        input.close();
    }
}
