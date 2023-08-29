package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * @author yangjl
 * @date 2023/8/21 14:35
 */
public class VowelCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = input.nextLine();
            int count = 0;
            //System.out.println("=="+str);
            for (int j = 0; j < str.length(); j++) {
                String curr = str.substring(j, j + 1);
                if (curr.equals("a") || curr.equals("e") || curr.equals("i") || curr.equals("o") || curr.equals("u") || curr.equals("y")) {
                    count++;
                }
            }
            sb.append(count).append(" ");
        }
        System.out.println(sb);
        input.close();
    }
}
