package hard.basic_calculator;

public class Solution {
    public static void main(String[] args) {
        Solution solve = new Solution();
        String exp = "-10-4";
        System.out.println(solve.calculate(exp));
    }

    public int calculate(String s) {
        StringBuilder sb = new StringBuilder(s.replace(" ", ""));
        if (!sb.toString().startsWith("-")) {
            sb.insert(0, '+');
        }

        return 0;
    }
}
