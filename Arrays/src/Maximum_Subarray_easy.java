
public class Maximum_Subarray_easy {

	public static void main(String[] args) {
		/**
		 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
		 */
		//For example, given the array [-2,1,-3,4,-1,2,1,-5,4]
		//the contiguous subarray [4,-1,2,1] has the largest sum = 6.

	}
	
	 public int maxSubArray(int[] nums) {
		 if (nums.length == 0) {
			 return 0;
		 }
		 int max = Integer.MIN_VALUE; // 要输出的结果
		 int sum = 0; // 以nums[i]为最后一个元素的subarray里， 能得到的最大和。
		 
		 for (int i = 0; i < nums.length; i++) {
			 sum += nums[i];
			 if (sum > max) max = sum;
			 
			 if (sum < 0) sum = 0;		// 因为如果此时和为负数，那么无论下一个数是多少，加上负数永远会越来越小，所以清零，以下一个数的值为此时的sum值。	 
		 }
		 
		 return max;
    }

}
