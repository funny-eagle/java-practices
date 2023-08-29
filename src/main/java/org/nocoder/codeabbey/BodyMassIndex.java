package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * <a href="https://www.codeabbey.com/index/task_view/body-mass-index--zh">body-mass-index</a>
 *
 * @author yangjl
 * @date 2023/8/29 09:40
 */
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            double bmi = input.nextDouble() / Math.pow(input.nextDouble(), 2.0d);
            sb.append(desc(bmi)).append(" ");
        }
        System.out.println(sb);
        input.close();
    }

    private static String desc(double bmi) {
        String res = "";
        if (bmi < 18.5d) {
            res = "under";
        }

        if (bmi >= 18.5d && bmi < 25.0d) {
            res = "normal";
        }

        if (bmi >= 25.0d && bmi < 30.0d) {
            res = "over";
        }

        if (bmi >= 30.0d) {
            res = "obese";
        }
        return res;
    }
}
