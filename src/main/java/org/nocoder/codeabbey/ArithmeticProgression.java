package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/arithmetic-progression--zh
 *
 * @author yangjl
 * @date 2023/8/21 16:57
 */
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int A = input.nextInt();
            int B = input.nextInt();
            int N = input.nextInt();
            int An = A + (N - 1) * B;
            sb.append(N * (A + An) / 2).append(" ");
        }
        System.out.println(sb);
    }
}
