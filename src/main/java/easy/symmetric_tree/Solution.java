package easy.symmetric_tree;


import base_classes.TreeNode;

import java.util.Stack;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        TreeNode left = root;
        TreeNode right = root;
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        while (!leftStack.isEmpty() && !rightStack.isEmpty() || left != null && right != null) {
            if (left != null && right != null) {
                if (left.val != right.val) return false;
                leftStack.push(left);
                rightStack.push(right);
                left = left.left;
                right = right.right;
            } else if (left == null && right == null){
                left = leftStack.pop().right;
                right = rightStack.pop().left;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
