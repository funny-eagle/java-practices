package org.nocoder.solution;

/**
 * 题目描述
 * 对于一个有序数组，我们通常采用二分查找的方式来定位某一元素，请编写二分查找的算法，在数组中查找指定元素。
 * 给定一个整数数组A及它的大小n，同时给定要查找的元素val，请返回它在数组中的位置(从0开始)，若不存在该元素，返回-1。
 * 若该元素出现多次，请返回第一次出现的位置。
 * 测试样例：
 * [1,3,5,7,9],5,3
 * [4,4,10,21],4,4
 * 返回：1
 *
 * @author jason
 * @date 18/4/1.
 */
public class BinarySearch {
    public int getPos(int[] A, int n, int val) {
        // low:起始位置下标
        int low = 0;
        // high:结束位置下标
        int high = n - 1;

        while (high > low) {
            // mid:中间位置下标
            int mid = (low + high) / 2;
            if (val < A[mid]) {
                // 如果目标值在左侧，结束位置下标修改为mid-1
                high = mid - 1;
            } else if (val == A[mid]) {
                // 如果目标值等于中间位置下标对应的值，将结束位置下标设置为中间位置下标，继续向左查找
                high = mid;
            } else {
                // 如果目标值在右侧，起始查找的位置下标修改为mid+1
                low = mid + 1;
            }
        }
        return A[low] == val ? low : -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 10, 10, 10, 10, 10, 10, 10};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.getPos(array, 8, 10));
    }
}
