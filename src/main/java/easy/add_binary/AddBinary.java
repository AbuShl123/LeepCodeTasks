package easy.add_binary;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("0", "1"));
        System.out.println(addBinary2("1011", "1010"));

        // 1011
        // 1010
        //  101
    }


    static public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int step = 1;

        while (i >= 0 || j >= 0) {
            boolean first = i >= 0 && (int) a.charAt(i) == 49;
            boolean second = j >= 0 && (int) b.charAt(j) == 49;
            if (sum.length() != step) sum.insert(0, '0');
            boolean current = sum.charAt(0)==49;

            if (first && second) {
                sum.insert(0, '1');
            } else if (first || second) {
                if (current) {
                    sum.insert(1,'0');
                } else {
                    sum.setCharAt(0, '1');
                }
            }

            i--;
            j--;
            step++;
        }

        return sum.toString();
    }


    // solution of another person (not mine)
    static public String addBinary2(String a, String b) {
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = a.length()-1, j = b.length()-1; i >= 0 || j >= 0;) {
            if(i >= 0) c += a.charAt(i--) - '0';
            if(j >= 0) c += b.charAt(j--) - '0';
            sb.insert(0, (char)((c % 2) + '0'));
            c /= 2;
        }
        if(c == 1) sb.insert(0, "1");
        return sb.toString();
    }
}
