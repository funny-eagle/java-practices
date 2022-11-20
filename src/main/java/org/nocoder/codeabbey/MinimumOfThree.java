package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/min-of-three--zh
 * @author yangjl
 * @date 2022年11月20日 22点37分
 */
public class MinimumOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        scanner.nextLine();
        
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextLine();
        }

        for (String s : arr) {
            String[] str = s.split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            int min = a;
            if(min > b) {
                min = b;
            }
            if(min > c){
                min = c;
            }
            System.out.print(min + " ");
        }

    }
}
