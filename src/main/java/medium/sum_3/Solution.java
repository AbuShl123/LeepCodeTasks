package medium.sum_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) { //  [-1, 0, 1, 2, -1, -4]
        Set<List<Integer>> listOfLists = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++)
            for (int j = i+1; j < len; j++)
                for (int k = j+1, g = len-1; k < len && g > j; k++, g--) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        listOfLists.add(Stream.of(nums[i], nums[j], nums[k])
                                .sorted().collect(Collectors.toList()));
                    }
                    if (nums[i] + nums[j] + nums[g] == 0) {
                        listOfLists.add(Stream.of(nums[i], nums[j], nums[g])
                                .sorted().collect(Collectors.toList()));
                    }
                    if (g - k <= 1) break;
                }

        return new ArrayList<>(listOfLists);
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
    }
}

