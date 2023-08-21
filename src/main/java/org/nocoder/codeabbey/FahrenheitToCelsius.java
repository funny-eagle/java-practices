package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/fahrenheit-celsius--zh
 *
 * @author yangjl
 * @date 2023/8/18 15:02
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(Math.round((input.nextInt() - 32) / 1.8)).append(" ");
        }
        System.out.println(sb.toString());
        input.close();
    }
}
