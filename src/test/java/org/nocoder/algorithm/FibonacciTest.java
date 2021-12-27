package org.nocoder.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    /**
     * 1, 1, 2, 3, 5, 8, 13, 21, 34
     */
    @Test
    public void fibonacci() {
        assertEquals(8, Fibonacci.fibonacci(6));
        assertEquals(21, Fibonacci.fibonacci(8));
        assertEquals(34, Fibonacci.fibonacci(9));
    }
}
