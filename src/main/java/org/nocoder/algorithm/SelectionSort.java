package org.nocoder.algorithm;

/**
 * 选择排序
 * 取数组的第一个元素，然后从第二个元素开始遍历数组,找出最小的值，与第一个元素交换位置，
 * 取第二个元素，从第三个元素开始遍历数组，找出最小值，与第二个元素交换位置，以此类推。
 * 选择排序是一种灵巧的算法，但是速度不是很快，需要的总时间为O(n * n)
 *
 * @author jason
 * @date 18/4/25.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 9, 5, 4, 8, 1, 6};
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }

    public static void selectionSort(int[] array) {
        if (array != null && array.length > 0) {

            for (int i = 0; i < array.length - 1; i++) {
                // 当前最小值初始化
                int currentMin = array[i];
                // 当前最小值的索引
                int currentMinIndex = i;

                // 从i+1的位置开始和i索引的值比较，如果小currentMin小，就替换currentMin为小的值
                for (int j = i + 1; j < array.length; j++) {
                    if (currentMin > array[j]) {
                        currentMin = array[j];
                        currentMinIndex = j;
                    }
                }

                System.out.println("第" + (i + 1) + "次循环结果：最小值：" + currentMin + ", 下标：" + currentMinIndex);

                if (currentMinIndex != i) {
                    // 将最小的元素和 剩余的第一个元素互换
                    array[currentMinIndex] = array[i];
                    array[i] = currentMin;
                }

            }
        }
    }
}
