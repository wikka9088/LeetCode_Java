
public class Majority_Element_easy {

	public static void main(String[] args) {
		/**
		 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
		 * You may assume that the array is non-empty and the majority element always exist in the array.
		 */
	}
	
	public int majorityElement(int[] nums) {
		//　　用一个标记cnt记录某个元素出现的次数，如果后面的元素和它相同就加一，有一个元素和他不相同就减一，当cnt小于等于0时重新记录新的元素。
		int res = nums[0];
		int times = 0;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == res) {
				times++;
			} else {
				if (times > 0) {
					times--;
				} else {
					res = nums[i];
				}
			}
		}
		
		return res;
    }

}
