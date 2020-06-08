package org.nocoder.exception;

public class ExceptionTest {

    public static void func1() throws Exception {
        Object o = null;
        o.equals("");
    }


    public static void main(String[] args) {
        try {
            ExceptionTest.func1();
        } catch (Exception e) {
            System.out.println("invoker: " + e);
        }
    }
}
