package org.nocoder.algorithm;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 *
 * @author YANGJINLONG on 2018-3-29.
 */
public class PrintLinkedListFromTailToHead {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        // 栈是LIFO结构
        Stack<Integer> stack = new Stack<Integer>();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}




