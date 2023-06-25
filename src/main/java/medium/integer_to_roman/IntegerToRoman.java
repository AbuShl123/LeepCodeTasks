package medium.integer_to_roman;

import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }

    static public String intToRoman(int num) {
        int n = num;
        StringBuilder roman = new StringBuilder();
        int count = 1;

        while (n > 0) {
            int digit = n%10;
            roman.insert(0, convertToRoman(digit, count));

            n /= 10;
            count *= 10;
        }

        return roman.toString();
    }

    static String convertToRoman(int digit, int count) {
        if (digit == 1 || digit == 5) return getRoman(digit*count);

        if (digit == 4) return getRoman(count) + getRoman(5*count);
        if (digit == 9) return getRoman(count) + getRoman(10*count);

        if (digit > 5) return getRoman(5*count) + getRoman(count).repeat(digit-5);

        return getRoman(count).repeat(digit);
    }

    static String getRoman(int number) {
        Map<Integer, String> romanSymbols = Map.of(
                1, "I",
                5, "V",
                10, "X",
                50, "L",
                100, "C",
                500, "D",
                1000, "M");

        return romanSymbols.get(number);
    }
}
