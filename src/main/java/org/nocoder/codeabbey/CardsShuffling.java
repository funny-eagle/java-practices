package org.nocoder.codeabbey;

import java.util.Scanner;

/**
 * https://www.codeabbey.com/index/task_view/cards-shuffling--zh
 *
 * @author yangjl
 * @date 2023/8/22 13:44
 */
public class CardsShuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        String[] cards = initCards();
        for (int i = 0; i < cards.length; i++) {
            // 洗牌用的下标随机数
            int index = Integer.parseInt(numbers[i]) % 52;
            String temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
        for (String card : cards) {
            System.out.print(card + " ");
        }
    }

    private static String[] initCards() {
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K" };
        String[] suits = {"C", "D", "H", "S" };
        String[] cards = new String[52];
        int idx = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                cards[idx] = String.join("", suit, rank);
                idx++;
            }
        }

        return cards;
    }
}
