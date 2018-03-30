package org.nocoder.solution;

/**
 * 题目描述
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author jason
 * @date 18/3/28.
 */
public class TwoDimensionalArraySearch {
    /**
     * 解题思路:从矩阵的左下角开始找,遇小上移,遇大右移
     * 矩阵的左下角,就是二维数组的最后一个数组元素中的第一个元素
     * @param target
     * @param array
     * @return
     */
    public boolean find(int target, int [][] array) {

        int lastIndex = array.length-1;

        if(array[lastIndex].length==0){
           return false;
        }

        for(int i= lastIndex; i>=0; i--){
            // 自下而上,查询矩阵第一列
            if(target == array[i][0]){
                return true;
            }
            // 遇小上移
            if(target < array[i][0]){
                continue;
            }
            // 遇大右移,从左往右查询
            for(int j = 0; j<array[i].length; j++){
                if(target == array[i][j]){
                    return true;
                }
                if(target > array[i][j]){
                    continue;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
//        int target = 7;
//        int[][] array = new int[][]{
//                {1,2,8,9},
//                {2,4,9,12},
//                {4,7,10,13},
//                {6,8,11,15}
//        };

        int target = 7;
        int[][] array = new int[][]{
                {},
                {}
        };
        System.out.println(array.length);
        TwoDimensionalArraySearch search = new TwoDimensionalArraySearch();
        System.out.println(search.find(target, array));
    }
}
