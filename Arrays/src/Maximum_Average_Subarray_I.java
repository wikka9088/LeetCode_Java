
public class Maximum_Average_Subarray_I {

	public static void main(String[] args) {
		/**
		 * Given an array consisting of n integers, 
		 * find the contiguous subarray of given length k that has the maximum average value. 
		 * And you need to output the maximum average value.
		 */
		//Input: [1,12,-5,-6,50,3], k = 4
		//Output: 12.75
		//Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75

	}

    public double findMaxAverage(int[] nums, int k) {
    	/**
    	 * 减少循环次数，因为只需要循环到nums.length-k次就可以了
		内层循环，累加连续的k个数，累加和赋值给临时变量total，判断返回值与total的大小，保证返回值最大。
			每次循环，不要忘记把total的值变为0
    	 */
    		double res = Double.NEGATIVE_INFINITY;
        int loop = nums.length - k;
        
        for (int i = 0; i <= loop; i++) {
        		int total = 0;
        		for (int j = 0; j < k; j++) {
        			total += nums[ i + j];
        		}
        		res = res < total ? total : res;
        }
        return res / k;
    }
}
