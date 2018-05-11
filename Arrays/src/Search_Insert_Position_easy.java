
public class Search_Insert_Position_easy {

	public static void main(String[] args) {
		/**
		 * Given a sorted array and a target value, 
		 * return the index if the target is found. 
		 * If not, return the index where it would be if it were inserted in order.
		 */

	}
	
    public int searchInsert(int[] nums, int target) {
    		//这道题比较简单，就是二分查找。思路就是每次取中间，如果等于目标即返回，否则根据大小关系切去一半。因此算法复杂度是O(logn)，空间复杂度O(1).
    		if (nums == null || nums.length == 0) {
			return 0;
		}
		int start = 0;
		int end = nums.length - 1;
		
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				start = mid  + 1;
			} else {
				end = mid - 1;
			}
		}
		return start;
    }

}
