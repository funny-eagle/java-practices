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
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[total];
        for (int i = 0; i < total; i++) {
            arr[i] = sc.nextLine();
        }

        for (String s : arr) {
            String[] numsArr = s.split(" ");
            if (Integer.parseInt(numsArr[0]) < Integer.parseInt(numsArr[1])) {
                System.out.print(Integer.parseInt(numsArr[0]) + " ");
            } else {
                System.out.print(Integer.parseInt(numsArr[1]) + " ");
            }
        }
        sc.close();
    }
}
