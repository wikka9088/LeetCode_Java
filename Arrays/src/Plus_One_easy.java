
public class Plus_One_easy {

	public static void main(String[] args) {
		/**
		 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
		 * You may assume the integer do not contain any leading zero, except the number 0 itself.
		 * The digits are stored such that the most significant digit is at the head of the list.
		 */
		
		

	}
	
	 public int[] plusOne(int[] digits) {
	        //遍历数组的每位，同时判断是否要进位，如果最后还有进位，则在数组最前面在插入1即可。
		 for (int i = digits.length - 1; i >= 0; i--) {
			 if (digits[i] < 9) {
				 digits[i] ++;
				 return digits;
			 }
			 digits[i] = 0;
		 }
		 
		 //如果for循环后还没return 值， 说明数组所有数字都是9， 则新建一个数组， 长度加1， 首位为1 即可。
		 int [] result = new int[digits.length + 1];
		 result[0] = 1;
		 return result;
    }

}
