package medium.online_stock_span;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(29));
        System.out.println(stockSpanner.next(91));
        System.out.println(stockSpanner.next(62));
        System.out.println(stockSpanner.next(76));
        System.out.println(stockSpanner.next(51));
    }
}

class StockSpanner {
    public StockSpanner() {

    }

    private final List<Integer> prices = new ArrayList<>();
    public int next(int price) {
        int res = 1;
        for (int i = prices.size()-1; i >= 0; i--){
            if (prices.get(i) > price) break;
            res++;
        }
        prices.add(price);
        return res;
    }
}
