import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_two_arrays_easy {

	public static void main(String[] args) {
		//Given two arrays, write a function to compute their intersection.
		//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

	}
	
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        HashSet<Integer> result = new HashSet<>();
        for (Integer n : nums1) {
        		if (this.binarySearch(n, nums2)) {
        			result.add(n);        			
        		}
        }
        int i = 0;
        int[] resultArr = new int[result.size()];
        for (Integer x : result) {
        		resultArr[i++] = x;
        }
        return resultArr;
    }
    
    public boolean binarySearch(int target, int[] array) {
    		int left = 0;
    		int right = array.length - 1;
    		while(left < right) {
    			int mid = left + (right - left) / 2;
    			if (target < mid) {
    				right = mid - 1;
    			} else if (target > mid) {
    				left = mid + 1;
    			} else {
    				return true;
    			}
    		}
    		return false;
    }

}
