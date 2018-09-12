
public class Number_of_1_bit {

	public static void main(String[] args) {
		/**
		 * Write a function that takes an unsigned integer and 
		 * returns the number of '1' bits it has (also known as the Hamming weight).
		 */
		//Input: 11
		//Output: 3
		//Explanation: Integer 11 has binary representation 00000000000000000000000000001011 

	}
	
    public int hammingWeight(int n) {
    		//n &= (n - 1) 表示把最低位的1 改为0
    		//所以只要n 不为0, 每次通过n &= (n - 1) 消除最低位1， 同时计数即可
    	
    		int result = 0;
    		while(n != 0) {
    			n &= (n - 1);
    			result++;
    		}
    		
    		return result;
    }

}
