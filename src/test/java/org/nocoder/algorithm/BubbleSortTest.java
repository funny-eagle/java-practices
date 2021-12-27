package org.nocoder.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] array = {2, 9, 5, 4, 8, 1, 6};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(array);

        int[] sortedArray = {1, 2, 4, 5, 6, 8, 9};
        assertArrayEquals(array, sortedArray);
    }
}
