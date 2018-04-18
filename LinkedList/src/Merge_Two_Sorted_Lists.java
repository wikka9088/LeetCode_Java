
public class Merge_Two_Sorted_Lists {

	public static void main(String[] args) {
		/**
		 * Merge two sorted linked lists and return it as a new list. 
		 * The new list should be made by splicing together the nodes of the first two lists.
		 */
		//Input: 1->2->4, 1->3->4
		//Output: 1->1->2->3->4->4

	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		/**
		 * 这里我们使用递归的方法。我们构造一个新的ListNode，就叫做tmp，看着像是一个临时变量。
		 * 的确，从局部来看它是临时变量，每次都会将l1或者l2赋值给它，但这里的l1和l2都是动态变化的，
		 * 最重要的是每次return的tmp都是一个新的链表，最后一次返回的也就是我们所合并出来的链表
		 */
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			ListNode temp = l1;
			temp.next = mergeTwoLists(l1.next, l2);
			return temp;
		} else {
			ListNode temp = l2;
			temp.next = mergeTwoLists(l1, l2.next);
			return temp;
		}
    }

}
