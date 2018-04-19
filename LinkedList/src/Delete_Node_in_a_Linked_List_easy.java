
public class Delete_Node_in_a_Linked_List_easy {

	public static void main(String[] args) {
		/**
		 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
		 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, 
		 * the linked list should become 1 -> 2 -> 4 after calling your function.
		 */

	}
	
	public void deleteNode(ListNode node) {
		//要删除链表的一个节点，需要知道当前节点的前驱节点。该题没有给出前驱节点，所以就需要将当前节点的后继节点的值复制到当前节点，然后删除后继节点即可。
		if (node == null) {
			return;
		}
		
		ListNode after = node.next;
		if (after != null) {
			node.val = after.val;
			node.next = after.next;
		}
    }

}
