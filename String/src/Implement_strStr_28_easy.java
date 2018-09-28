
public class Implement_strStr_28_easy {

	public static void main(String[] args) {
		/*
		 * Return the index of the first occurrence of needle in haystack, 
		 * or -1 if needle is not part of haystack.
		 */
		//Input: haystack = "hello", needle = "ll"
		//Output: 2
		
		//Input: haystack = "aaaaa", needle = "bba"
		//Output: -1

	}
	
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
        		return 0;
        }
        
        for (int i = 0; ; i++) {
        		for (int j = 0; ; j++) {
        			if (j == needle.length()) {
        				return i;
        			}
        			if (i + j == haystack.length()) {
        				return -1;
        			}
        			if (haystack.charAt(i + j) != needle.charAt(j)) {
        				break;
        			}
        		}
        }
    }

}
