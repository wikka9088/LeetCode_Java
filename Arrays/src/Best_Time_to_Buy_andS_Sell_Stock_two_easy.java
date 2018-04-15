
public class Best_Time_to_Buy_andS_Sell_Stock_two_easy {

	public static void main(String[] args) {
		/**
		 * Say you have an array for which the i th element is the price of a given stock on day i.
		 * 
		 * Design an algorithm to find the maximum profit. 
		 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
		 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
		 */

	}
	
	public int maxProfit(int[] prices) {
		//https://www.cnblogs.com/Mrjie/p/6009783.html
		//可以画一个折线图 这道题的意思就是把所有上坡的地方加起来. 空间复杂度o（1）级别  遍历一次时间复杂度0(n)
		if (prices.length == 0 || prices == null) {
			return 0;
		}
		
		int profit = 0;
		
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] - prices[i - 1] > 0) {
				profit += prices[i] - prices[i - 1];
			}
		}
		
		return profit;
    }

}
