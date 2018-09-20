import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum_15 {

	public static void main(String[] args) {
		/**
		 * Given an array nums of n integers, 
		 * are there elements a, b, c in nums such that a + b + c = 0? 
		 * Find all unique triplets in the array which gives the sum of zero.
		 */
		
		//Given array nums = [-1, 0, 1, 2, -1, -4],
		/**
		 * A solution set is:
			[
			  [-1, 0, 1],
			  [-1, -1, 2]
			]
		 */

	}
	
	/*
	 * 思路： 
		先升序排序，然后用第一重for循环确定第一个数字。 
		然后在第二重循环里，第二、第三个数字分别从两端往中间扫。 
		如果三个数的sum等于0，得到一组解。 
		如果三个数的sum小于0，说明需要增大，所以第二个数往右移。 
		如果三个数的sum大于0，说明需要减小，所以第三个数往左移。 
		时间复杂度：O(n2) 
		注意： 
		但是虽然按照上述写法写出，却还是时间超出 
		于是考虑细节， 
		当第一个数>0时，直接跳出循环 
		当一个数和下一个数相等，则跳出本次循环
	 */
    public List<List<Integer>> threeSum(int[] nums) {
    		List<List<Integer>> res = new ArrayList<>();
    		Arrays.sort(nums);
    		for (int i = 0; i < nums.length - 2; i++) {
//    			if (i > 0 && nums[i] == nums[i + 1]) continue; // remove duplicate val
    			
    			// two pointers : low , high; make sure nums[i] + low + high = 0;
    			int low = i + 1;
    			int high = nums.length - 1;
    			int sum = 0 - nums[i];
    			
    			while (low < high) {
    				if (nums[low] + nums[high] == sum) {
    					if (!res.contains(Arrays.asList(nums[i], nums[low], nums[high])) ) {
    						res.add(Arrays.asList(nums[i], nums[low], nums[high]));
    					}
    					
    					low++;
    					high--;
//    					while (nums[low] == nums[low + 1]) low++;
//    					while(nums[high] == nums[high - 1]) high--;
    				} else if (nums[low] + nums[high] < sum) {
    					low++;
    					
    				} else {
    					high--;
    				}
    			}
    			
    		}
    		return res;
    }

}
