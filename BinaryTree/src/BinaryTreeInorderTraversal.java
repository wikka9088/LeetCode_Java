import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		/**
		 * Input: [1,null,2,3]
   1
    \
     2
    /
   3

		Output: [1,3,2]
		 */

	}
	
	class Solution {
	    public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> result = new ArrayList<>();
	        Deque<Guide>  path = new ArrayDeque<>();
	        
	        path.addFirst(new Guide(0, root));
	        
	        while(!path.isEmpty() ) {
	        		Guide current = path.removeFirst();
	        		 if (current.node == null) continue;
	        		 
	        		 if (current.operation == 1) {
	        			 result.add(current.node.val);
	        		 } else {
	        			 path.addFirst(new Guide(0, current.node.right));
	        			 path.addFirst(new Guide(1, current.node));
	        			 path.addFirst(new Guide(0, current.node.left));
	        		 }
	        }
	        
	        
	        return result;
	    }
	}
	
	class Guide {
		int operation; // 0: visit; 1: print;
		TreeNode node;
		
		public Guide(int oper, TreeNode node) {
			this.operation = oper;
			this.node = node;
		}
	}
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	  	TreeNode right;
		TreeNode(int x) { val = x; }
	}

}
