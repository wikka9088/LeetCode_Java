
public class Best_Time_to_Buy_andS_Sell_Stock_one_easy {

	public static void main(String[] args) {
		/**
		 * Say you have an array for which the i th element is the price of a given stock on day i.
		 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
		 * design an algorithm to find the maximum profit.
		 */
		//Input: [7, 1, 5, 3, 6, 4]
		//Output: 5
		//max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

	}
	//时间复杂度为 O(n)
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		
		int min = prices[0];
		int profit = 0;
		
		// 第i天的价格可以看作是买入价也可以看作是卖出价
		for (int i = 1; i < prices.length; i++) {
			// 找到更低的买入价
			if (prices[i] < min) {
				// 更新买入价
				min = prices[i];
			}
			// 当天的价格不低于买入价 // 如果当天买出的价格比之前卖出的价格高
			else if (prices[i] - min >= profit) {
				// 更新卖出价
				profit = prices[i] - min;
			}
		}
		
		return profit;
    }

}
