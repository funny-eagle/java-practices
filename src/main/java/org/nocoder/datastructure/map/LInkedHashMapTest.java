package org.nocoder.datastructure.map;

import java.util.LinkedHashMap;

/**
 * @author yangjl
 * @description LinkedHashMap test
 * @date 2022-10-26 13:50
 **/
public class LInkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        map.put(7, "g");
        map.put(8, "h");
        map.put(9, "i");
        map.put(10, "j");

        System.out.println(map);
    }
}
