package org.nocoder.tree;

/**
 * @author jason
 * @date 2019/6/17.
 */
public class TreeNode {
    public  TreeNode(int value){
        this.value = value;
    }
    /**
     * 当前节点值
     */
    private int value;
    /**
     * 左边子节点
     */
    private TreeNode leftSubNode;
    /**
     * 右边子节点
     */
    private TreeNode rightSubNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftSubNode() {
        return leftSubNode;
    }

    public void setLeftSubNode(TreeNode leftSubNode) {
        this.leftSubNode = leftSubNode;
    }

    public TreeNode getRightSubNode() {
        return rightSubNode;
    }

    public void setRightSubNode(TreeNode rightSubNode) {
        this.rightSubNode = rightSubNode;
    }
}
