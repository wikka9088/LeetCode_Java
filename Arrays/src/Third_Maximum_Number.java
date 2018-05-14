
public class Third_Maximum_Number {

	public static void main(String[] args) {
		/**
		 * Given a non-empty array of integers, return the third maximum number in this array. 
		 * If it does not exist, return the maximum number. 
		 * The time complexity must be in O(n)
		 */
		// Input: [2, 2, 3, 1]
		// Output: 1

	}
	
    public int thirdMax(int[] nums) {
    		int one, two, three;
        one = two = three = Integer.MIN_VALUE;
        int count = 0; // this number is to count the biggest number changing times, it should be over 3 times
        
        for (int x : nums) {
        		if (count >= 1 && one  == x || count >= 2 && two == x) {
        			continue;
        		}
        		if (x > one) {
        			three = two;
        			two = one;
        			one = x;
        			count++;
        		} else if (x > two) {
        			three = two;
        			two = x;
        			count++;
        		} else if (x >= three) { // key point: prevent the third min point is exactly Integer.MIN_VALUE; 
        			three = x;
        			count++;
        		}
        }
        
        if (count >=3) {
        		return three;
        } else {
        		return one;
        }
    }

}
