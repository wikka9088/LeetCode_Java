import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Positions_of_Large_Groups {

	public static void main(String[] args) {
		/**
		 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
		 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
		 * Call a group large if it has 3 or more characters.  
		 * We would like the starting and ending positions of every large group.
		 */
		//Input: "abbxxxxzzy"
		//Output: [[3,6]]
		//Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
		
		//Input: "abcdddeeeeaabbbcd"
		//Output: [[3,5],[6,9],[12,14]]

	}
	
    public List<List<Integer>> largeGroupPositions(String S) {
    		List<List<Integer>> res = new ArrayList<>();
    		int i = 0; // the start of group which is under testing
    		int n = S.length();
    		
    		for (int j = 0; j < n; j++) {
    			if (j == n - 1 || S.charAt(j) != S.charAt(j + 1)) {
    				//此时 [i, j] 就是复合要求的list之一
    				
    				if (j - (i - 1) >=3) {
    					res.add(Arrays.asList(new Integer[] {i, j}));
    				}
    				
    				i = j + 1;
    			}
    		}
    		
    		
    		return res;
    }

}
