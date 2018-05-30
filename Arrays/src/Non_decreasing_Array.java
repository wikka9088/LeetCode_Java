
public class Non_decreasing_Array {

	public static void main(String[] args) {
		/**
		 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
		 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
		 */
		
		//Input: [4,2,3]
		//Output: True
		//Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
		
		//Input: [4,2,1]
		//Output: False
		//Explanation: You can't get a non-decreasing array by modify at most one element.

	}
	
    public boolean checkPossibility(int[] nums) {
    		//[1] => true
    		if (nums.length == 1) {
            return true;
        }
         boolean flag = false;
        for (int i = 1; i < nums.length; i++) {
        		if (nums[i] < nums[i - 1]) {
        			if (flag) {
                        return false;
                    }
                    if (i >= 2 && nums[i] > nums[i - 2]) {
                        nums[i - 1] = nums[i];
                    } else if (i >= 2 && nums[i] < nums[i - 2]) {
                    		//[1, 3, 4, 2, 3] => false
                        nums[i] = nums[i - 1];
                    }
                    flag = true;
        		}
        		
        }
        
        return true;
    }

}
