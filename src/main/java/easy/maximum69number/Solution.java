package easy.maximum69number;

public class Solution {
    private int n = 0;
    public int maximum69Number (int num) {
        for (int i = 1000, n = num; i != 0; i /= 10, n=n%i){
            if (n/i == 6) return num + i*3;
        }
        return num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.maximum69Number(9669));
    }
}


