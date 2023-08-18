package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/sum-in-loop
 */
public class SumInLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        input.nextLine();
        String data = input.nextLine();
        int sum = 0;
        if (data != null && !"".equals(data)) {
            String[] s = data.split(" ");

            for (int i = 0; i < s.length; i++) {
                sum += Integer.parseInt(s[i]);
            }
        }
        System.out.println(sum);
        input.close();
    }
}
