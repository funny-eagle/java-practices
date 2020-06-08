package org.nocoder.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试 HashMap 死循环
 * <p>
 * HashMap通常会用一个指针数组（假设为table[]）来做分散所有的key，
 * 当一个key被加入时，会通过Hash算法通过key算出这个数组的下标i，
 * 然后就把这个<key, value>插到table[i]中，如果有两个不同的key被算在了同一个i，
 * 那么就叫冲突，又叫碰撞，这样会在table[i]上形成一个链表。
 */
public class HashMapInfiniteLoop {

    private static Map<Integer, Integer> map = new HashMap<>(2, 0.75f);

    public static void main(String[] args) {
        map.put(1, 1);
        System.out.println(map);
        new Thread(() -> {
            map.put(2, 2);
            System.out.println(map);
        }).start();

        new Thread(() -> {
            map.put(3, 3);
            System.out.println(map);
        }).start();
    }
}
