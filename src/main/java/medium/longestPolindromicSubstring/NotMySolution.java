package medium.longestPolindromicSubstring;

public class NotMySolution {
    public String longestPalindromeString(String str) { // amazing solution!  Although not mine
        int start = 0;
        int end = 0;

        int high, low;

        int n = str.length();

        for (int i = 0 ; i < n; i++) {
            low = i;
            high = i+1;
            while (high < n && low >= 0 && str.charAt(high) == str.charAt(low)){
                if ((end-start) < (high - low)) {
                    start = low; end = high;
                }
                low--; high++;
            }

            low = i;
            high = i+2;
            while (high < n && low >= 0 && str.charAt(high) == str.charAt(low)){
                if ((end-start) < (high - low)) {
                    start = low; end = high;
                }
                low--; high++;
            }
        }

        return str.substring(start, end+1);
    }

    public static void main(String[] args) {
        NotMySolution solve = new NotMySolution();
        System.out.println(solve.longestPalindromeString("asdasdarakolnfgfnlokcecarasdad"));
    }
}
