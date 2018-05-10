
public class Longest_Continuous_Increasing_Subsequence_easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
        		return 0;
        }
        int max = 1;
        for (int i = 1, k = 1; i < nums.length; i++) {
        		if (nums[i] > nums[i - 1]) {
        			max = Math.max(max, ++k);
        		} else {
        			k = 1;
        		}
        }
        return max;
    }
}
