package org.nocoder.exception;

/**
 * Unchecked Exceptions 不会在编译时进行检查，不需要在方法名后使用 throws 抛出
 * <p>
 * Java中，Error 和 RuntimeException 的类都是 Unchecked Exceptions，
 * <p>
 * 其余的在 throwable 下的都是 checked exceptions
 *
 * @author jason
 * @date 2019/6/5.
 */
public class TestUncheckedException {

    public static void testA(String s) {
        if (s == null || s.equals("")) {
            throw new IllegalArgumentException("string is not valid!");
        }
    }


    public static void main(String[] args) {
        // testA("");

        int x = 0;
        int y = 10;
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        int z = y / x;
    }
}
