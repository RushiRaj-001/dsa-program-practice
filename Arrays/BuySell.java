

public class BuySell {

    public static int Profit(int[] prices) {
        int max_profit = 0;
        int Buy_price = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (Buy_price < prices[i]) {
                int profit = prices[i] - Buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                Buy_price = prices[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 4, 5, 6, 3 };

        System.out.println(Profit(prices));
    }
}