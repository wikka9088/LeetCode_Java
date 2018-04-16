
public class Missing_Number_easy {

	public static void main(String[] args) {
		/**
		 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
		 */
		//Input: [9,6,4,2,3,5,7,0,1]
		//Output: 8

	}
	
	 public int missingNumber(int[] nums) {
		 int expectedSum = 0;
		 int actualSum = 0;
		 for (int i = 0; i < nums.length; i++) {
			 expectedSum += (i + 1); // 我们可以计算出从0到n的所有数字的总和
			 actualSum += nums[i]; //我们可以计算出从0到n， 丢掉一个数后， 其余所有数字的总和
		 }
		 return expectedSum - actualSum;
	 }
	
	

}
