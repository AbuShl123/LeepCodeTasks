package easy.binary_tree_inorder_traversal;

import base_classes.TreeNode;

import java.util.*;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.right;
            } else {
                TreeNode node = stack.pop();
                list.addFirst(node.val);
                p = node.left;
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
