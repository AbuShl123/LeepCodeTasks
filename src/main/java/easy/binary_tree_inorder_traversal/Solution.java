package easy.binary_tree_inorder_traversal;

import base_classes.TreeNode;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solve = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(solve.inorderTraversal(root));

        solve.printInorder(root);
        System.out.println();
        solve.printInorderNotIterative(root);
    }


    public void printInorder(TreeNode node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    public void printInorderNotIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                System.out.print(node.val + " ");
                root = node.right;
            }
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode node = stack.pop();
                list.add(node.val);
                root = node.right;
            }
        }
        return list;
    }


    private final List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal2(TreeNode root) {
        if (root == null) return result;

        inorderTraversal2(root.left);
        result.add(root.val);
        inorderTraversal2(root.right);

        return result;
    }
}
