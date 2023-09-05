package org.nocoder.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 约瑟夫环程序
 * 幸运儿问题
 */
public class LinkedListGame {

    public static void main(String[] args) {
        // 创建一个元素类型为Integer的链表
        LinkedList<Integer> lucky = new LinkedList<>();
        int number, count;
        // 将每个人的编号一次放入链表中
        for (number = 1; number <= 100; number++) {
            lucky.addLast(number);
        }
        count = 100;
        number = 0;

        Iterator<Integer> iterator = lucky.iterator();
        // 循环删除退出的人，知道只剩下一个人
        while (count > 1) {
            if (iterator.hasNext()) {
                iterator.next();
                number++;
            } else {
                // 迭代器已经到达末尾，重置到链表首部
                iterator = lucky.iterator();
            }

            // 删除应该退出圈外的人（14号）
            if (number == 14) {
                number = 0;
                iterator.remove();
                count--;
            }
        }

        System.out.println("幸运儿是：" + lucky.element());
    }
}
