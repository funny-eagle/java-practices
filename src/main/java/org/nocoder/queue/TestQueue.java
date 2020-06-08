package org.nocoder.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LinkedList实现了List 和 Deque
 * Deque支持在两端插入和删除元素，deque是 double-ended queue 双端队列的简称，
 * 通常的发音为 deck 。Deque接口继承自Queue，增加了从队列连贯插入和删除元素的方法。
 */
public class TestQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // offer方法用于向队列添加一个元素，类似于Collection接口中的add方法
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");

        // peek方法，获取但不移除队列的头元素，如果队列为空，则返回null
        System.out.println(queue.peek());

        // element 方法，获取但不移除队列的头元素，如果队列为空，则抛异常
        System.out.println(queue.element());


        while (queue.size() > 0) {
            // remove方法删除队列的头元素，如果队列为空，则抛异常
            System.out.println(queue.remove());
        }

        // poll方法与remove方法类似，但如果队列为空时，poll方法会返回null，remove方法会抛异常
        System.out.println(queue.poll());
    }
}
