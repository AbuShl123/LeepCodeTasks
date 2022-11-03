package medium.longestPolindromicSubstring;

public class Solution {
    public String longestPalindrome(String str) { //  ab
       String longest = "";
       int b = str.length()-1;
       int a = 0;
       while (b >= 0) {
           if (str.charAt(a) == str.charAt(b)){
               String s = str.substring(a, b+1);
               if (isPalindromic(s)) {
                   if (s.length() > longest.length()) longest = s;
                   b--; a=0; continue;
               }
           }
           a = str.indexOf(str.charAt(b), a+1);
           if (b==a){
               a = 0; b--;
           }
       }
       return longest;
    }

    public boolean isPalindromic(String word) { // a
        int a = 0;
        int b = word.length()-1;
        while (word.charAt(a) == word.charAt(b)){
            if (b-a <= 1) return true; // a = 1 b = -1
            a++; b--;
        }
        return false;
    }


    public static void main(String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.longestPalindrome("babad"));
    }
}
