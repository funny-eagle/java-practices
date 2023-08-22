package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/sum-in-loop
 */
public class SumInLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
        }
        System.out.println(sum);
        input.close();
    }
}
