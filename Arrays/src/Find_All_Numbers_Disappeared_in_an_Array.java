import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Find_All_Numbers_Disappeared_in_an_Array {

	public static void main(String[] args) {
		/**
		 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
		 * Find all the elements of [1, n] inclusive that do not appear in this array.
		 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
		 */

	}
	
    public List<Integer> findDisappearedNumbers(int[] nums) {
    		//method 1, space O(x) = nums.length;
//        Set<Integer> set = new HashSet<>();
//        List<Integer> list = new LinkedList<>();
//        int index = 1;
//        for(int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
//        for(int i = 0; i < nums.length; i++, index++) {
//            if(!set.contains(index)) {
//                list.add(index);
//            }
//        }
//        return list;
        
        
        //method2, space O(x) = 0;
        if (nums == null || nums.length == 0) {
    			return new LinkedList<>(); 
        }
	    List<Integer> res = new LinkedList<>();
	    for (int i = 0; i < nums.length; i++) {
	    		int val = Math.abs(nums[i]);
	    		if (nums[val - 1] > 0) {
	    			nums[val - 1] = -nums[val - 1];
	    		}
	    }
	    
	    for(int j = 0; j < nums.length; j++) {
	    		if (nums[j] > 0) {
	    			res.add(j + 1);
	    		}
	    }
	    
	    
	    return res;
    }

}
