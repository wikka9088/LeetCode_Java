
public class Linked_List_Cycle_easy {

	public static void main(String[] args) {
		/**
		 * Given a linked list, determine if it has a cycle in it.
		 */
		//Can you solve it without using extra space?

	}
	
	public boolean hasCycle(ListNode head) {
		/**
		 * 我们可以使用快慢引用的思路。
		 * 两个引用都指向链表头，从链表头开始遍历，慢引用每次前进一步，而快引用每次前进两步，如果链表是有环路的，那么快引用终将追上慢引用；
		 * 如果没有环路，那么遍历就会有结束的时候
		 */
		
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
    }

}
