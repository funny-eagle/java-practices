package org.nocoder.basic;

import java.util.Scanner;

/**
 * 整钱兑零(人民币)
 * 输入一个浮点数,单位为元,
 * 人民币从大到小分为 100元,50元,20元,10元,5元,1元,5角,2角,1角,5分,2分,1分,
 * 把给定的钱数按面额从大到小的顺序进行组合,使货币数量最小
 *
 * @author jason
 * @date 18/3/25.
 */
public class ComputeChange {
    public static void main(String[] args) {
        // 输入一个钱数(浮点数)
        System.out.print("请输入钱数(元):");
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();

        int[] yuan = new int[]{100, 50, 20, 10, 5, 1};
        for (int i = 0; i < yuan.length; i++) {
            int count = (int) amount / yuan[i];
            System.out.println(yuan[i] + "元面额:" + count + "张");

            // 兑换后剩下的钱数
            amount = (amount % yuan[i]);
            System.out.println("      兑换" + yuan[i] + "元面额后,剩下的钱数:" + amount + "元");
        }

        if (amount > 0) {
            int[] jiao = new int[]{5, 2, 1};
            amount = amount * 10;
            System.out.println("剩下的钱数可以转换为:" + amount + "角");
            for (int i = 0; i < jiao.length; i++) {
                int count = (int) amount / jiao[i];
                System.out.println(jiao[i] + "角面额:" + count + "张");
                amount = amount % jiao[i];
                System.out.println("      兑换" + jiao[i] + "角面额后,剩下的钱数:" + amount + "角");
            }
        }

        if (amount > 0) {
            int[] fen = new int[]{5, 2, 1};
            amount = amount * 10;
            System.out.println("剩下的钱数可以转换为:" + amount + "分");
            for (int i = 0; i < fen.length; i++) {
                int count = (int) amount / fen[i];
                System.out.println(fen[i] + "分面额:" + count + "张");
                // 兑换后剩下的钱数
                amount = amount % fen[i];
                System.out.println("      兑换" + fen[i] + "分面额后,剩下的钱数:" + amount + "分");
            }
        }
    }
}
