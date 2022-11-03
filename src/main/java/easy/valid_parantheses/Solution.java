package easy.valid_parantheses;

public class Solution {
    public boolean isValid(String s) { //   "(]"
        if (s.length() == 1) return false;
        int a = 0;
        int b = 1;
        boolean bool = false;
        while (a >= 0 && b < s.length()) {
            int num = s.charAt(b) - s.charAt(a);
            if (num <= 2 && num > 0) {
                bool = true;
                a--;
            }
            else if (a+1 != b) break;
            else a++;

            b++;
        }
        s = s.substring(0, a+1) + s.substring(b);
        return bool && (s.length() == 0 || isValid(s));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isValid("(]")); // "(([]){})"
    }
}
