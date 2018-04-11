import java.util.HashMap;
import java.util.Map;

public class Two_Sum_easy {

	public static void main(String[] args) {
		/**
		 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
			You may assume that each input would have exactly one solution, and you may not use the same element twice.
		 */
		
		//Given nums = [2, 7, 11, 15], target = 9,
		//Because nums[0] + nums[1] = 2 + 7 = 9,
		//return [0, 1].

	}
	
	//方法1: 双层循环 遍历数组， 时间复杂度 O(n*n);
	 public int[] twoSum(int[] nums, int target) {
	        int index1 = 0;
	        int index2 = 0;
	        
	        if (nums.length == 1) {
	            return null;
	        }
	        
	        for (int i = 0; i < nums.length; i++){
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] + nums[j] == target) {
	                    index1 = i;
	                    index2 = j;
	                }
	            }
	        }
	        
	        return new int[] { index1, index2 };		
	    }
	 
	 
	//方法2: 预先构造hash表储存key value，时间复杂度 O(n) 空间复杂度O(n)
	 public int[] twoSum2(int[] nums, int target) {
		 Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	        int[]result=new int[2];
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(target-nums[i])){
	                result[0]=map.get(target-nums[i]);
	                result[1]=i;
	                return result;
	            } else {
	                map.put(nums[i], i);
	            }
	        }
	        return null;
		  
		 
	 }
} 
