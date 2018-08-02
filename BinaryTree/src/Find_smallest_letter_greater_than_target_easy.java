import java.util.Arrays;

public class Find_smallest_letter_greater_than_target_easy {

	public static void main(String[] args) {
		/**
		 * Given a list of sorted characters letters containing only lowercase letters, 
		 * and given a target letter target, 
		 * find the smallest element in the list that is larger than the given target.
		 */
		//Input:
		//letters = ["c", "f", "j"]
		//		target = "a"
		//		Output: "c"

	}
	
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        return letters[this.binarySearch(letters, target)];
    }
    
    public int binarySearch(char[] letters, char target) {
    		int left = 0;
    		int right = letters.length - 1;
    		while (left < right) {
    			int mid = left + (right - 1) / 2;
    			if (letters[mid] <= target) {
    				left = mid + 1;
    			} else{
    				right = mid;
    			} 
    			
    		}
    		if (letters[right] > target) {
				return right;
			}else {
				return 0;
			}
    		
    }

}
