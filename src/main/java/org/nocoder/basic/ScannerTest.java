package org.nocoder.basic;

import java.util.Scanner;

/**
 * @author jason
 * @date 18/3/25.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double d1 = input.nextDouble();
        System.out.println(d1);
        double d2 = input.nextDouble();
        System.out.println(d2);
    }
}
