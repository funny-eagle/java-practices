package org.nocoder.datastructure.tree;

/**
 * @author jason
 * @date 2019/6/17.
 */
public class Traversal {

    /**
     * 前序遍历 pre order traversal
     * <p>
     * 先访问根节点，然后访问子节点
     *
     * @param root
     */
    public static void preOrderTraversal(TreeNode root) {
        System.out.print(root.getValue() + " ");
        if (root.getLeftSubNode() != null) {
            preOrderTraversal(root.getLeftSubNode());
        }
        if (root.getRightSubNode() != null) {
            preOrderTraversal(root.getRightSubNode());
        }
    }

    /**
     * 中序遍历 in order traversal
     * <p>
     * 先访问左（右）子节点，然后访问根，最后访问右（左）子节点
     *
     * @param root
     */
    public static void inOrderTraversal(TreeNode root) {

        if (root.getLeftSubNode() != null) {
            inOrderTraversal(root.getLeftSubNode());
        }
        System.out.print(root.getValue() + " ");
        if (root.getRightSubNode() != null) {
            inOrderTraversal(root.getRightSubNode());
        }
    }

    /**
     * 后序遍历 post order traversal
     * <p>
     * 先访问子树，然后访问根
     *
     * @param root
     */
    public static void postOrderTraversal(TreeNode root) {

        if (root.getLeftSubNode() != null) {
            postOrderTraversal(root.getLeftSubNode());
        }

        if (root.getRightSubNode() != null) {
            postOrderTraversal(root.getRightSubNode());
        }
        System.out.print(root.getValue() + " ");
    }

    public static TreeNode buildTreeNode() {

        TreeNode root = new TreeNode(3);
        root.setRightSubNode(new TreeNode(1));
        root.getRightSubNode().setLeftSubNode(new TreeNode(2));

//        TreeNode root = new TreeNode(5);
//
//        root.setLeftSubNode(new TreeNode(4));
//        root.setRightSubNode(new TreeNode(6));
//
//        root.getLeftSubNode().setLeftSubNode(new TreeNode(3));
//        root.getLeftSubNode().setRightSubNode(new TreeNode(7));
//
//        root.getRightSubNode().setLeftSubNode(new TreeNode(2));
//        root.getRightSubNode().setRightSubNode(new TreeNode(8));
//
//        root.getLeftSubNode().getLeftSubNode().setLeftSubNode(new TreeNode(1));


        return root;
    }


    /**
     * 前序遍历：5 4 3 1 7 6 2 8
     * 中序遍历：1 3 4 7 5 2 6 8
     * 后序遍历：1 3 7 4 2 8 6 5
     *
     * @param args
     */
    public static void main(String[] args) {
        TreeNode root = buildTreeNode();
        // 前序遍历
        System.out.print("前序遍历：");
        preOrderTraversal(root);

        System.out.println();

        // 中序遍历
        System.out.print("中序遍历：");
        inOrderTraversal(root);

        System.out.println();

        // 后续遍历
        System.out.print("后序遍历：");
        postOrderTraversal(root);
    }
}
