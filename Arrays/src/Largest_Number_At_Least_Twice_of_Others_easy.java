import java.util.Arrays;

public class Largest_Number_At_Least_Twice_of_Others_easy {

	public static void main(String[] args) {
		/**
		 * In a given integer array nums, there is always exactly one largest element.
		 * Find whether the largest element in the array is at least twice as much as every other number in the array.
		 * If it is, return the index of the largest element, otherwise return -1.
		 */
	}
	
    public int dominantIndex(int[] nums) {
        //遍历找到最大的数字保存数字和下标，再遍历找到第二大的数字。按要求返回就可以了。 
    		if (nums.length == 0 || nums == null) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
    		int max = Integer.MIN_VALUE;
    		int flag = 0;
    		
    		for(int i = 0; i < nums.length; i++) {
    			if (max < nums[i]) {
    				max = nums[i];
    				flag = i;
    			}
    		}
    		Arrays.sort(nums);
    		if (max > 2 * nums[nums.length - 2]) {
    			return flag;
    		} else {
    			return -1;
    		}
    }

}
