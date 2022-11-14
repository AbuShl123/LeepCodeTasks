package easy.isTreeHeightBalanced;

import base_classes.TreeNode;

public class Solution {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.right.left = new TreeNode(3);

        Solution solve = new Solution();
        System.out.println(solve.isBalanced(tree));
    }


    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int h1 = height(node.left);
        int h2 = height(node.right);

        if (h1 == -1 || h2 == -1) return -1;

        if (Math.abs(h1-h2) > 1) return -1;

        return Math.max(h1, h2)+1;
    }


    //my solution:
    int h1, h2;
    public boolean isBalanced2(TreeNode root) {
        if (root == null) return true;
        return Math.abs(height(root.left)-height(root.right)) <= 1 &&
                isBalanced(root.left) && isBalanced(root.right);
    }

    private int height2(TreeNode node) {
        if (node == null) return 0;
        int h1 = height(node.left);
        int h2 = height(node.right);
        if (h1>h2) return h1+1; else return h2+1;
    }
}
