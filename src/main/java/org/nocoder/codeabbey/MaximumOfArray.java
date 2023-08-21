package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/maximum-of-array--zh
 * @author yangjl
 * @date 2023/8/18 10:25
 */
public class MaximumOfArray {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] arr = text.split(" ");
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (String v : arr) {
            long cur = Long.parseLong(v);
            if(max < cur)
                max = cur;
            if(min > cur)
                min = cur;
        }
        System.out.println(max + " " + min);
        input.close();
    }

}
