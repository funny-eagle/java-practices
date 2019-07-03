package org.nocoder.algorithm;

/**
 * selection sort practice
 * @author jason
 * @date 2019/5/17.
 */
public class SelectionSortPractice {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 5, 1, 3};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length -1; i++) {
            int currentMinVal = arr[i];
            int currentMinIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                // 如果下一个元素比基准元素小，更新最小值和最小值下标
                if(currentMinVal > arr[j]){
                    currentMinVal = arr[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinVal != arr[i]){
                // 交换位置
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMinVal;
            }

        }
    }
}
