package hard.median_of_two_sortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int len = arr.length;
        // [1, 3] [2]
        int i = 0, a = 0, b = 0;
        while (i < len) {
            if (a == nums1.length) {
                arr[i] = nums2[b];
                b++;
            } else if (b == nums2.length || nums1[a] < nums2[b]){
                arr[i] = nums1[a]; a++;
            } else {
                arr[i] = nums2[b];
                b++;
            }
            i++;
        }

        if (len % 2 == 1) return arr[len/2];
        return (double) (arr[len/2] + arr[len/2-1])/2;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
