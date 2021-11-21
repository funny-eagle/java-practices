package org.nocoder.string;

import java.util.Scanner;

/**
 * 格式化字符串
 * Created by YANGJINLONG on 2018-3-29.
 */
public class FormatString {
    public static void main(String[] args) {
        int number = 99;
        // 不足4为的补0
        System.out.println(String.format("%04d", number));

        String a = "hello";
        String b = "hi";
        String c = "hi";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));

    }

    private static void ScannerNext() {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        System.out.println("a:" + a);
        String b = input.nextLine();
        System.out.println("b:" + b);
    }
}
