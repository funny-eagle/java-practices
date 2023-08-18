package org.nocoder.algorithm;

import java.util.Scanner;

/**
 * 两个字符串类型的数字相加，求进位次数
 * @author yangjl
 * @date 2023/8/15 16:55
 */
public class Carry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        handle(s1, s2);
    }

    public static void handle(String s1, String s2) {
        int maxLength = Math.max(s1.length(), s2.length());
        int carry = 0;
        int cc = 0;
        for (int i = maxLength - 1; i >= 0; i--) {
            // 位数差值
            int x = Math.abs(s1.length() - s2.length());
            int c1 = Integer.parseInt(s1.substring(i, i + 1));
            int c2 = 0;
            if ((i - x) >= 0) {
                c2 = Integer.parseInt(s2.substring(i - x, i - x + 1));
            }
            //System.out.println("i=" + i + " , c1=" + c1 + ", c2=" + c2);
            if ((c1 + c2 + carry) > 9) {
                cc++;
                carry = 1;
            } else {
                carry = 0;
            }
        }
        System.out.println(cc);
    }
}
