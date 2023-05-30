package org.nocoder.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    /**
     * 1, 1, 2, 3, 5, 8, 13, 21, 34
     */
    @Test
    public void fibonacci() {
        Fibonacci fib = new Fibonacci();
        assertEquals(8, fib.fibonacci(6));
        assertEquals(21, fib.fibonacci(8));
        assertEquals(34, fib.fibonacci(9));
    }
}
