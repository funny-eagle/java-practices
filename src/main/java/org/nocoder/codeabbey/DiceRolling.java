package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * <a href="https://www.codeabbey.com/index/task_view/dice-rolling--zh">Dice Rolling</a>
 * @author yangjl
 * @date 2023/8/22 15:32
 */
public class DiceRolling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int r = (int)Math.floor(input.nextDouble() * 6) + 1;
            sb.append(r).append(" ");
        }
        System.out.println(sb);
        input.close();
    }
}
