package easy.longest_subsecuence_with_limited_sum;

import java.util.Arrays;

public class Solution {

    public static int[] answerQueries1(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            answer[i] = recHelp(nums, 0, queries[i], 0);
        }

        return answer;
    }

    public static int recHelp(int[] arr, int start, int target, int size) {
        if (start >= arr.length) {
            if (target >= 0) return size;
            return 0;
        }

        return Math.max(recHelp(arr, start+1, target-arr[start], size+1),
                        recHelp(arr, start+1, target, size));

    }

    public static int[] answerQueries2(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);

        for (int i = 0; i < queries.length; i++) {
            int s = 0;
            int key = 0;
            for (int v : nums){
                key+=v;
                if (key > queries[i]) break;
                s++;
            }
            answer[i] = s;
        }

        return answer;
    }

    public static int[] answerQueries3(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 1 ; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        for (int i = 0; i < queries.length; i++) {
            int j = Arrays.binarySearch(nums, queries[i]);
            answer[i] = Math.abs(j+1);
         }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(answerQueries1(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21})));
        System.out.println(Arrays.toString(answerQueries2(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21})));
        System.out.println(Arrays.toString(answerQueries3(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21})));
    }
}
