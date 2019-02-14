package org.nocoder.exception;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNullPointerException {

    public static void main(String[] args) {
        List<String> list = null;
        // 这种情况会抛空指针异常，而不是不走循环
        for (String s : list)
            System.out.println(s);
    }
}
