package org.nocoder.array;

/**
 * 简单桶排序
 */
public class SimpleBucketSort {

    public static int[] simpleBucketSort(int[] arr) {

        // 初始化11个桶，默认值为0
        int[] bucket = new int[11];

        // 遍历待排序数组，哪个数字出现过，就把下标相同的桶值加1
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]] += 1;
        }

        int[] res = new int[arr.length];
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                res[index] = i;
                index++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 3, 2, 5, 0};
        int[] res = simpleBucketSort(arr);
        for (int i = 0; i < res.length; i++) {
            if(i != res.length-1){
                System.out.print(res[i] + ", ");
            }else{
                System.out.print(res[i]);
            }
        }
    }
}
