package myTask.splitArray;

import java.util.ArrayList;
import java.util.List;

public class SplitArray {
    public static boolean splitArray(int[] nums) {
        return getNum(0, nums, 0, 0);
    }

    private static List<Integer> list = new ArrayList<>();
    public static boolean getNum(int start, int[] arr, int v, int v2) {
        if (start >= arr.length) {
            list.add(v);
            return v == v2;
        }

        return getNum(start+1, arr, v+arr[start], v2) || getNum(start+1, arr, v, v2+arr[start]);
    }

    public static void main(String[] args) {
        System.out.println(getNum(0, new int[] {6,5,8}, 0, 0));
        System.out.println(list);
        list.clear();
        System.out.println(getNum(0, new int[] {5, 2, 3}, 0, 0));
        System.out.println(list);
        list.clear();
        System.out.println(getNum(0, new int[] {2,2,10,10,1,1}, 0, 0));
        System.out.println(list);
    }
}
