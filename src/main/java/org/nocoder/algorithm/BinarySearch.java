package org.nocoder.algorithm;

/**
 * 题目描述
 * 对于一个有序数组，我们通常采用二分查找的方式来定位某一元素，请编写二分查找的算法，在数组中查找指定元素。
 * 给定一个整数数组arr，同时给定要查找的元素val，请返回它在数组中的位置(从0开始)，若不存在该元素，返回-1。
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
    public int getPos(int[] arr, int val) {
        int len = arr.length;
        // 起始位置下标
        int low = 0;
        // 结束位置下标
        int high = len - 1;

        while (high > low) {
            // mid:中间位置下标
            int mid = (low + high) / 2;
            if (val < arr[mid]) {
                // 如果目标值在左侧，结束位置下标修改为mid-1
                high = mid - 1;
            } else if (val == arr[mid]) {
                // 如果目标值等于中间位置下标对应的值，将结束位置下标设置为中间位置下标，继续向左查找
                high = mid;
            } else {
                // 如果目标值在右侧，起始查找的位置下标修改为mid+1
                low = mid + 1;
            }
        }
        return arr[low] == val ? low : -1;
    }

    /**
     *
     * @param arr
     * @param v
     * @return
     */
    public int bs(int[] arr, int v){
        int len = arr.length;
        int start = 0, end = len -1;

        while(end > start){
            int mid = (start + end) / 2;
            System.out.println("中间位置的下标为："+mid);

            if(v > arr[mid]){
                System.out.println("目标值"+v+"大于中间值"+arr[mid]);
                start = mid + 1;
                System.out.println("将起始位置往 右 移动到中间值下标+1的位置，移动后的start="+start+",end="+end);
            }

            if(v < arr[mid]){
                System.out.println("目标值"+v+"小于中间值"+arr[mid]);
                end = mid - 1;
                System.out.println("将终止位置往 左 移动到中间值下标-1的位置，移动后的start="+start+",end="+end);
            }

            if(v == arr[mid]){
                // 找到了先不着急return，如果目标元素出现多次，需要返回第一次出现的位置
                // 这里把终点end更新成中间值mid，再次循环

                end = mid;
                System.out.println("找到了先不着急return，如果目标元素出现多次，需要返回第一次出现的位置,这里把终点end更新成中间值mid,等循环结束, start="+start+", end="+end);
            }
        }

        if(arr[end] == v){
            System.out.println("目标值"+v+"在数组总第一次出现的位置下标为"+end);
            return end;
        }else{
            System.out.println("目标值"+v+"不在数组中");
            return -1;
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,4,5,5,6,7,8,9};
        int v = 5;
        BinarySearch b = new BinarySearch();
        System.out.println(b.bs(arr, v));
    }
}
