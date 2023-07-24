package org.nocoder.newfeature;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjl
 * @description foreach loop
 * @date 2022-10-31 11:27
 **/
public class ForeachLoopExample {


    public static void main(String[] args) {
        listForeach();
    }

    private static void listForeach() {
        List<String> list = new ArrayList<>();
        list.add("Jason");
        list.add("Funny");
        list.add("Seven");

        list.forEach(System.out::println);
        // 等同于以下写法
        list.forEach((n) -> System.out.println(n));
    }
}
