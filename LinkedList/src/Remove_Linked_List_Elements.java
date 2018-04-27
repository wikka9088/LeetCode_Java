
public class Remove_Linked_List_Elements {

	public static void main(String[] args) {
		/**
		 * Remove all elements from a linked list of integers that have value val.
		 */
		//Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
		//Return: 1 --> 2 --> 3 --> 4 --> 5

	}
	
    public ListNode removeElements(ListNode head, int val) {
    			//有了dummy节点后，就不需要进行非零判定了
//    		if (head == null || head.next == null) {
//    			return head;
//    		}
    		
    		ListNode dummy = new ListNode(0);
    		dummy.next = head;
    		
    		ListNode pointer = dummy;
    		while(pointer.next != null) {
    			if (pointer.next.val == val) {
    				pointer.next = pointer.next.next;
    			} else {
    				pointer = pointer.next;
    			}
    		}
    		
    		return dummy.next;
    }

}
