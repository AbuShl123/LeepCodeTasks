package easy.convert_sortedArray_to_binarySearchTree;

import base_classes.BinaryTree;
import base_classes.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(0, nums.length-1, nums);
    }

    public TreeNode helper(int start, int end, int[] nums) {
        if (end < start) return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(start, mid-1, nums);
        node.right = helper(mid+1, end, nums);
        return node;
    }

    public static void main(String[] args) {
        int[] sortedArr = new int[] {-10,-3,0,5,9};
        Solution solution = new Solution();
        BinaryTree.printInorder(solution.helper(0, 4, sortedArr));
    }

}
