package leetcode.medium;


public class StockProfit {


    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 0; i < prices.length - 1; i++) { //0-5
            if (prices[i] < minPrice)
                minPrice = prices[i];
            int profit = prices[i + 1] - minPrice;
            if (profit > maxProfit)
                maxProfit = profit;
            
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        System.out.println("Profit " + maxProfit(new int[]{7, 1, 5, 3, 6, 4, 10, 3}));
    }

}
