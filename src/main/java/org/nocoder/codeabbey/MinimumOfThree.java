package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/min-of-three--zh
 * @author yangjl
 * @date 2022年11月20日 22点37分
 */
public class MinimumOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int min = a;
            if(min > b) {
                min = b;
            }
            if(min > c){
                min = c;
            }
            sb.append(min).append(" ");
        }
        System.out.println(sb.toString());
        input.close();
    }
}
