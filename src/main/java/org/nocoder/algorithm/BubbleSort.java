package org.nocoder.algorithm;


/**
 * @author jason
 * @date 18/4/25.
 */
public class BubbleSort {


    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = new int[]{4, 3, 6, 2, 1, 7, 6, 9};
        bs.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

}
