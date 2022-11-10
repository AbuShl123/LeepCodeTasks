package easy.remove_all_adjasent_duplicates_in_string;

public class Solution {

    public static String removeDuplicates(String s) {
        int first = 0;
        int second = 1;
        boolean wasChanged = false;
        while (first >= 0 && second < s.length()) {
            if (s.charAt(first) == s.charAt(second)) {
                wasChanged = true;
                first--; second++;
            }
            else if (first+1 != second) break;
            else {
                first++; second++;
            }
        }

        if (wasChanged) return removeDuplicates(s.substring(0,first+1) + s.substring(second));
        return s;
    }


    public static String removeDuplicates2(String s) {
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                s = s.replace(s.charAt(i)+""+s.charAt(i+1), "");
                i = -1;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates2("abbacabb"));
    }
}
