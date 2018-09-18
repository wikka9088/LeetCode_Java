
public class Climbing_stairs_70_easy {

	public static void main(String[] args) {
		/**
		 * You are climbing a stair case. It takes n steps to reach to the top.

			Each time you can either climb 1 or 2 steps. 
			In how many distinct ways can you climb to the top?
		 */

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
