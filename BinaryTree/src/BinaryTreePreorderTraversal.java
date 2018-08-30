import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		/**
		 * Input: [1,null,2,3]
   1
    \
     2
    /
   3

			Output: [1,2,3]
		 */

	}
	
	class Solution {
	    public List<Integer> preorderTraversal(TreeNode root) {
	         List<Integer> result = new ArrayList<>();
	         Deque<Guide> path = new ArrayDeque<>();
	         
	         path.addFirst(new Guide(0, root));
	         while (!path.isEmpty()) {
	        	 	Guide current = path.removeFirst();
	        	 	
	        	 	//defensive coding
	        	 	if (current.node == null) continue;
	        	 	
	        	 	if (current.operation == 1) {
	        	 		result.add(current.node.val);
	        	 	} else {
	        	 		path.addFirst(new Guide(0, current.node.right));
	        	 		path.addFirst(new Guide(0, current.node.left));
	        	 		path.addFirst(new Guide(1, current.node));
	        	 	}
	         }
	         
	         return result;
	    }
	}
	
	class Guide {
		int operation; // 0: visit node; 1: print node
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


