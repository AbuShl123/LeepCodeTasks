package myTask.regex;

public class MyPattern {
    public boolean matches(String p, String str) {
        int start = 0;
        int end = 0;
        while (end < p.length() && (str.charAt(start) == p.charAt(end) || p.charAt(end) == '.')) {
            start++; end++;
            if (start >= str.length()) return true;
            if (end == p.length()) return false;
            if (p.charAt(end) == '*') {
                end--;
                if (p.charAt(end) != str.charAt(start) && p.charAt(end) != '.') end+=2;
            }
        }

        return false;
    }
}
