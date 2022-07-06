package Array;

/*
 You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

public class BuySellStocks {
    public int maxProfit(int[] prices) {


        int lNum= Integer.MAX_VALUE;
        int prof, result =0;

        for (int price : prices) {

            if (price < lNum) {
                lNum = price;
            }

            prof = price - lNum;

            if (prof > result) {
                result = prof;
            }

        }

        return result;

    }

    public static void main(String[] args) {


        int[] prices  = {7,1,5,3,6,4};
        BuySellStocks buySellStocks = new BuySellStocks();
        buySellStocks.maxProfit(prices);

    }
}
