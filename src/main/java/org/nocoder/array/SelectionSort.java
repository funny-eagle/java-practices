package org.nocoder.array;

/**
 * 选择排序
 * @author jason
 * @date 18/4/25.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 9, 5, 4, 8, 1, 6};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void selectionSort(int[] array) {
        if (array != null && array.length > 0) {

            for (int i = 0; i < array.length - 1; i++) {
                int currentMin = array[i];
                int currentMinIndex = i;

                // 找到最小的元素
                for (int j = i + 1; j < array.length ; j++) {
                    if(currentMin > array[j]){
                        currentMin = array[j];
                        currentMinIndex = j;
                    }
                }

                System.out.println("第" + (i+1) + "次循环结果：最小值：" + currentMin + ", 下标：" + currentMinIndex);

                if(currentMinIndex != i){
                    // 将最小的元素和 剩余的第一个元素互换
                    array[currentMinIndex] = array[i];
                    array[i] = currentMin;
                }

            }
        }
    }
}
