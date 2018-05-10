import java.util.Arrays;

public class Array_Partition_I_easy {

	public static void main(String[] args) {
		/**
		 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
		 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
		 */
		
		//Input: [1,4,3,2]
		//Output: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

	}
	
	public int arrayPairSum(int[] nums) {
		//先排序，将相邻两个数分为一组，每组较小数都在左边，求和即可
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length; i+=2) {
			result += nums[i];
		}
		return result;
    }

}
