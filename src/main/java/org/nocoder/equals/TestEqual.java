package org.nocoder.equals;

/**
 * 包装类型间的相等判断应该用equals，而不是'=='
 */
public class TestEqual {
    public static void main(String[] args) {
        Integer x = new Integer(8);
        Integer y = new Integer(8);
        // 包装类型间的相等判断应该用equals，而不是'=='
        System.out.println("x==y: " + (x == y));
        System.out.println("x.equals(y): " + (x.equals(y)));
    }
}
