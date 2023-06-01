package org.nocoder.datastructure.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Random 生成随机数，记录每个数字生成的次数
 *
 * @author yangjinlong
 */
public class Statistics {
    public static void main(String[] args) {
        Map<Integer, Integer> countingMap = new HashMap<>();
        Random random = new Random(System.nanoTime());
        for (int i = 0; i < 10000; i++) {
            int key = random.nextInt(10);
            Integer value = countingMap.get(key);
            countingMap.put(key, value == null ? 1 : value + 1);
        }
        System.out.println(countingMap);
    }
}
