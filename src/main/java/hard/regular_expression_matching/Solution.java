package hard.regular_expression_matching;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Solution {


    public static boolean isMatch(String str, String p) { // "aaaaaa" "a*"

        for (int i = 0, b = 0; i < p.length(); i++) {
            if (i < p.length()-1 && p.charAt(i+1) == '*') {
                while (b < str.length() && str.charAt(b) == p.charAt(i)) b++;
                i = i+2;
                continue;
            }
            if (p.charAt(i) != str.charAt(b)) return false;
        }
        return false;
    }

    public static void main(String[] args) {


        System.out.println(Pattern.matches(".*bbb", "asdabbb"));

        String regex = "a*bbc.b.*";
        // a*, b, b, c, ., b, .*

        System.out.println(12%10);
    }
}
