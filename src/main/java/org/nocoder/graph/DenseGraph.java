package org.nocoder.graph;

import java.util.List;

/**
 * 稠密图 - 领接矩阵
 * @author yangjl
 * @date 2023/8/10 16:53
 */
public class DenseGraph {

    private int m; // 点数
    private int n; // 边数

    private boolean directed; // 有向图 和 无向图
    private List<List<Boolean>> g;  // 邻接矩阵，布尔类型是否有这条边

    /**
     *
     * @param n 顶点
     * @param directed 是否有向图
     */
    public DenseGraph(int n, boolean directed){
        this.n = n;
        this.m = 0;
        this.directed = directed;

        for (int i = 0; i < n; i++) {

        }
    }
}
