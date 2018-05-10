import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers_easy {

	public static void main(String[] args) {
		/**
		 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
		 */

	}
	
	public int maximumProduct(int[] nums) {
		/**
		 * 求三个数的最大乘积，要考虑数值为正还是为负。首先可以利用Arrays.sort()进行排序，得到最大值。
		 * 如果最大值为负值，则数组中所有的值都为负值，最大的乘积就是最后三位数字的乘积；
		 * 如果最大值为正值，则数组中可能存在负值，若都为正值，最大乘积为最后三位的乘积，若存在负值，可能最大值为最大数与前两位的乘积。
		 */
		if (nums.length == 0 || nums == null) {
			return 0;
		}
		
		Arrays.sort(nums);
		int length = nums.length;
		int a = nums[length - 3] * nums[length - 2] * nums[length - 1];
		int b = nums[0] * nums[1] * nums[length - 1];
		return a > b ? a : b;
    }

}
