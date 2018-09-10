
public class Single_number {

	public static void main(String[] args) {
			//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
			//Input: [4,1,2,1,2]
			//Output: 4
	}
	
    public int singleNumber(int[] nums) {
     // XOR: same  = 0; different = 1;
    	// two same number doing XOR operation is 0;
    	//which means if XOR all numbers in the array, the number returning is the single number
    		int result = 0;
	    for (int i = 0; i < nums.length; i++) {
	    		result ^= nums[i];
	    }
	    
	    return result;
    }

}
