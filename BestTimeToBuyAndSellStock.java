
/* (easy)
  say you have an array for which the ith element is the price of a given stock on day i.
  if you were only permitted to complete at most one transaction (i.e., buy one and sell
  one share of the stock), design an algorithm to find the maximum profit
*/
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.printf("max profit is %d", maxProfit(prices));

    }

    static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; ++i) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}
