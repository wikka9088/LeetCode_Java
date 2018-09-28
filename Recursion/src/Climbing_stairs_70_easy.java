
public class Climbing_stairs_70_easy {

	public static void main(String[] args) {
		/**
		 * You are climbing a stair case. It takes n steps to reach to the top.

			Each time you can either climb 1 or 2 steps. 
			In how many distinct ways can you climb to the top?
		 */

	}
	
	public int recursionMethod(int n) 
	{
		//反向思维： 假设n = 5; 即f(5) = f(4) + f(3) ; f(4) = f(3) + f(2) ...
		if (n == 1 || n == 2) {
			return n;
		}
		
		return recursionMethod(n - 1) + recursionMethod(n - 2);
	}
	
    public int climbStairs(int n) {
        return climbing(0, n);
    }
    
    public int climbing(int start, int total) {
    		if (start > total) {
    			return 0;
    		}
    		if (start == total) {
    			return 1;
    		}
    		
    		return climbing(start + 1, total) + climbing(start + 2, total);
    }

}
