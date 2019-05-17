package org.nocoder.algorithm.sort;


/**
 * @author jason
 * @date 18/4/25.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {2, 9, 5, 4, 8, 1, 6};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
