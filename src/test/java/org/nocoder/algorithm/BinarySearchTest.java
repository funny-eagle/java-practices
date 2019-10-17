package org.nocoder.algorithm;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void getPos() {
        BinarySearch bs = new BinarySearch();

        int[] arr1 = {10, 10, 10, 10, 10, 10, 10, 10};
        assertEquals(0, bs.getPos(arr1, 10));

        int[] arr2 = {1, 2, 3, 4,10, 10, 10, 10, 10};
        assertEquals(3, bs.getPos(arr2, 4));
    }
}
