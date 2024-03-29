package org.nocoder.algorithm;

/**
 * 动态规划-01背包问题
 */
public class BagProblem01 {

    /**
     * @param w  每个物品的重量
     * @param v  每个物品的价值
     * @param c  背包总容量
     * @param n  物品总数量
     * @return 最大价值
     */
    public int maxValue(int[] w, int[] v, int c, int n) {
        // 初始化表格，每一个表格的值都为0
        int[][] cell = new int[n + 1][c + 1];
        // 下标0对应的第1行第1列都是0，直接从下标1开始计算
        for (int j = 1; j <= c; j++) {
            for (int i = 1; i <= n; i++) {
                if (w[i] > j) {
                    // 装不下的情况，取上一个格子的值
                    cell[i][j] = cell[i - 1][j];
                } else {
                    // 装的下情况：取两者较大的值
                    // 剩余空间的最大价值 = 上一行的(j - 当前物品的重量) 对应下标的值
                    cell[i][j] = Math.max(cell[i - 1][j], v[i] + cell[i - 1][j - w[i]]);
                }
                System.out.println("i=" + i + ", j=" + j + "时：");
                print(cell);
            }
        }
        return cell[n][c];
    }

    public static void main(String[] args) {
        // 吉他 $1500, 1磅
        // 音响 $3000, 4磅
        // 电脑 $2000, 3磅
        int[] w = new int[]{0, 1, 4, 3};
        int[] v = new int[]{0, 1500, 3000, 2000};
        int c = 4;
        int n = 3;

        BagProblem01 b = new BagProblem01();
        int maxValue = b.maxValue(w, v, c, n);
        System.out.println("最大价值：" + maxValue);
    }


    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("i=" + i);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(", j=" + j + " " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("=====================================");
    }
}
