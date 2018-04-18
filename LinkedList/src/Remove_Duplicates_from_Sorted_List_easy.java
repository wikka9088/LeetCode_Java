
public class Remove_Duplicates_from_Sorted_List_easy {

	public static void main(String[] args) {
		/**
		 * Given a sorted linked list, delete all duplicates such that each element appear only once.
		 */
		//Given 1->1->2, return 1->2.
		//Given 1->1->2->3->3, return 1->2->3.

	}
	
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode dummy = head;
		
		while(dummy.next != null) {
			if (dummy.val == dummy.next.val) {
				dummy.next = dummy.next.next;
			} else {
				dummy = dummy.next;
			}
		}
		return head;
		
		
    }

}
