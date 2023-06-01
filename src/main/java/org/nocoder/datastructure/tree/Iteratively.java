package org.nocoder.datastructure.tree;

/**
 * @author jason
 * @date 2019/6/18.
 */
public class Iteratively {
    public static TreeNode buildTreeNode() {
        TreeNode root = new TreeNode(1);

        root.setRightSubNode(new TreeNode(2));


        root.getRightSubNode().setLeftSubNode(new TreeNode(3));


        return root;
    }

    public static void main(String[] args) {

    }
}
