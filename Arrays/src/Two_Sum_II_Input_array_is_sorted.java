
public class Two_Sum_II_Input_array_is_sorted {

	public static void main(String[] args) {
		/**
		 * Given an array of integers that is already sorted in ascending order, 
		 * find two numbers such that they add up to a specific target number.
		 * The function twoSum should return indices of the two numbers such that they add up to the target, 
		 * where index1 must be less than index2.
		 * Your returned answers (both index1 and index2) are not zero-based.
		 * You may assume that each input would have exactly one solution and you may not use the same element twice.
		 */
		
		//Input: numbers = [2,7,11,15], target = 9
		//Output: [1,2]
		//Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

	}
	
    public int[] twoSum(int[] numbers, int target) {
    		//greedy algorithm, 两头pointer 向中间移动.
    		 if (numbers == null || numbers.length == 0) {
    			 return null;
    		 }
    		 
    		 int i = 0;
    		 int j = numbers.length - 1;
    		 
    		 while(i < j) {
    			 int sum = numbers[i] + numbers[j];
    			 if (sum > target) {
    				 j--;
    			 } else if (sum < target){
    				 i++;
    			 } else {
    				 return new int[] {i + 1 , j  +1};
    			 }
    		 }
    		 return null;
    }

}
