package easy.remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class Solution {
    public static int[] removeDuplicates(int[] nums){
        int k = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                k--; i--;
                int j = i+1, m = i;
                while (j < nums.length) {
                    nums[m] += nums[j];
                    nums[j] = nums[m] - nums[j];
                    nums[m++] -= nums[j++];
                }
            }
            if (i+1 == k) break;
        }

        return nums;
    }

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(removeDuplicates()));
    }
}
