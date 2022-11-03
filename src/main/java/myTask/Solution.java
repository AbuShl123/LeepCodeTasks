package myTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    /*
     given an array of strings. Find the longest common substring between the strings of the array.

     [flight, flower, flow] -> "fl"
     [flow, blow] -> "low"
     [car, cir] -> "r"
     [flylowgo, flower, flow] -> "low"
     [apple, pineapple] -> "apple"
     [dog, apple, tree] -> ""

     1 >= arr <= 200
     0 >= arr[i] <= 200
     arr[i] contains of only lowercase english letters
     */

    public String findLongestCommonSubstring(String[] arr) {
        String str = arr[0];
        List<String> list = new ArrayList<>();
        int a = 0;
        int b = 1;
        while (b <= str.length()) {
            String prefix = str.substring(a, b);
            if (Arrays.stream(arr).allMatch(e -> e.contains(prefix))) {
                list.add(prefix);
                b++;
            } else a++;
        }
        if (list.size() == 0) return "";
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}
