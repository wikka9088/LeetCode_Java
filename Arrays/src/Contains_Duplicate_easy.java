import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_easy {

	public static void main(String[] args) {
		/**
		 * Given an array of integers, find if the array contains any duplicates.
		 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
		 */

	}
	
	public boolean containsDuplicate(int[] nums) {
		if (nums.length <= 1 || nums == null) {
			return false;
		}
		Set<Integer> map = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.contains(nums[i])) {
				return true;
			} else {
				map.add(nums[i]);
			}
		}
		return false;
    }

}
