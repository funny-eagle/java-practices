package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/sums-in-loop
 */
public class SumsInLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int sum = input.nextInt() + input.nextInt();
            sb.append(sum + " ");
        }
        System.out.println(sb);
        input.close();
    }
}
