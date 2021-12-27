package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/sums-in-loop
 */
public class SumsInLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        String[] arr = new String[total];
        for (int i = 0; i < total; i++) {
            arr[i] = scanner.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            String[] nums = arr[i].split(" ");
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                int intValue = Integer.parseInt(nums[j]);
                sum += intValue;
            }
            System.out.print(sum + " ");
        }

        scanner.close();
    }
}
