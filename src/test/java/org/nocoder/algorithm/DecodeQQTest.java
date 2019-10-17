package org.nocoder.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeQQTest {
    @Test
    public void test(){
        int[] arr = new int[]{6, 3, 1, 7, 5, 8, 9, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertEquals("615947283", DecodeQQ.decode(arr));
    }
}
