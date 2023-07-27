package org.nocoder.algorithm;

import org.junit.Test;

public class FibonacciTest {
    /**
     * 1, 1, 2, 3, 5, 8, 13, 21, 34
     */
    @Test
    public void fibonacci() {
//        assertEquals(8, Fibonacci.fibonacci(6));
//        assertEquals(21, Fibonacci.fibonacci(8));
//        assertEquals(34, Fibonacci.fibonacci(9));
//        assertEquals(8,Fibonacci.fibonacci(6 ));
//
//        long start = System.currentTimeMillis();
//        long r = Fibonacci.fibRecursion(50);
//        System.out.println(r);
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        long start2 = System.currentTimeMillis();
        long res = Fibonacci.fibonacci(50);
        System.out.println(res);
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
}
