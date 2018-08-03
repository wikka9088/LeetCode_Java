
public class valid_perfect_square_easy {

	public static void main(String[] args) {
		/**
		 * Given a positive integer num, 
		 * write a function which returns True if num is a perfect square else False.
		 */
		
		//Input: 16 Return true
		//Input: 14 Return false

	}
	
    public boolean isPerfectSquare(int num) {
        /*
         * 这道题给了我们一个数，让我们判断其是否为完全平方数，
         * 那么显而易见的是，肯定不能使用brute force，这样太不高效了，
         * 那么最小是能以指数的速度来缩小范围，那么我最先想出的方法是这样的，
         * 比如一个数字49，我们先对其除以2，得到24，发现24的平方大于49，
         * 那么再对24除以2，得到12，发现12的平方还是大于49，
         * 再对12除以2，得到6，发现6的平方小于49，
         * 于是遍历6到12中的所有数，看有没有平方等于49的，有就返回true，没有就返回false
         */
    	
    		if (num == 0) {
    			return false;
    		}
    		if (num == 1) {
    			return true;
    		}
//    		
//    		int mid = num / 2, square = mid * mid;
//    		while (square > num) {
//    			mid = mid / 2;
//    			square = mid * mid;
//    		}
//    		for (int i = mid; i <= i + i; ++i) {
//    			if (num == i * i) {
//    				return true;
//    			}
//    		}
//    		return false;
    	
    	
    	
	    	/**
	    	 * binary search
	    	 */
	    	long left = 0;
	    	long right = num;
	    	
	    	while (left <= right) {
	    		long mid = left + (right - left) / 2;
		    	long square = mid * mid;
	    		if (square == num) {
	    			return true;
	    		}
	    		if (square > num) {
	    			right = mid - 1;
	    		}
	    		else {
	    			left = mid + 1;
	    		}
	    	
	    	}
	    	return false;
	    	
	    	
	    	/**
	    	 * 下面这种方法就是纯数学解法了，利用到了这样一条性质，完全平方数是一系列奇数之和，例如：

			1 = 1
			4 = 1 + 3
			9 = 1 + 3 + 5
			16 = 1 + 3 + 5 + 7
			25 = 1 + 3 + 5 + 7 + 9
			36 = 1 + 3 + 5 + 7 + 9 + 11
			....
			1+3+...+(2n-1) = (2n-1 + 1)n/2 = n*n
			
			
	    	 */
    }

}
