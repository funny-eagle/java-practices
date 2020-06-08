package org.nocoder.array;

/**
 * 数组复制
 *
 * @author jason
 * @date 18/3/31.
 */
public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // 使用clone()方法,返回一个复制后的新数组
        int[] newArr1 = arr.clone();

        // 使用System.arraycopy方法,此方法没有返回值
        int[] newArr2 = new int[arr.length];
        System.arraycopy(arr, 0, newArr2, 0, arr.length);
        for (int i : newArr2) {
            System.out.println(i);
        }
    }

}
