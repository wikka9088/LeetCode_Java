
public class Rotate_Array_easy {
	public static void main(String[] args) {
		/**
		 * Rotate an array of n elements to the right by k steps.
		 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
		 */
		
		Rotate_Array_easy c = new Rotate_Array_easy();
		int arr[] = {1,2,3,4,5,6,7};
		c.rotate(arr, 2);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void rotate(int[] nums, int k) {
		/**
		 * 利用数组的length - k 把数组 分为两半；
		 * reverse 左边和右边的数组；
		 * reverse 总数组。
		 */
		
		/**
		 *  1 2 3 4 5 6 7　　如果k = 3 的话， 会变成 5 6 7 1 2 3 4
		 *  1 2 3 4 5 6 7　　middle = 7 - 3 = 4，分为左边 4个数字，右边 3个数字
		 *  4 3 2 1 7 6 5　　分别把左右reverse 一下
		 *  5 6 7 1 2 3 4　　把总数组reverse 一下就会得到答案
		 */
		if(nums == null || nums.length == 0 || k % nums.length == 0)
			return;
		
		k = nums.length - k % nums.length;
		
		int length = nums.length;
		reverse(nums, 0, length - k - 1);
		reverse(nums, length - k, length - 1);
		reverse(nums, 0 , length - 1);
    }
	
	public void reverse(int[] nums, int a, int b) {
		while(a < b) {
			int temp = nums[b];
			nums[b] = nums[a];
			nums[a] = temp;
			a++;
			b--;
		}
	}
}
