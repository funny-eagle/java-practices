package org.nocoder.algorithm;

/**
 * 小哈的QQ号
 * 小哈同学给了一串加了密的数字 631758924，首先将第一个数删除，
 * 紧接着将第二个数放在这串数字的末尾，再将第3个数删除，并将第4个数放在这串数的末尾，
 * 以此类推，直到剩下最后一个数，将最后一个数也删除，按照刚刚删除的顺序，
 * 把这些删除的数字连在一起就是小哈的QQ号:615947283
 *
 * @author jason
 * @date 2019/2/19.
 */
public class DecodeQQ {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, 1, 7, 5, 8, 9, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        // 队列头
        int head = 0;
        // 队列尾指向队尾指向后一个位置
        int tail = 9;

        while (head < tail) {
            // 打印队首并将队首出队
            System.out.println(arr[head]);
            head++;
            // 将新队首的数字添加到队尾
            arr[tail] = arr[head];
            tail++;
            // 再将队首出队
            head++;
        }

    }
}
