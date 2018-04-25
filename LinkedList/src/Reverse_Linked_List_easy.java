import java.util.Stack;

public class Reverse_Linked_List_easy {

	public static void main(String[] args) {
		//Reverse a singly linked list.

	}
	
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
        		return head;
        }
        
        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();
        while (temp != null) {
        		stack.push(temp);
        		temp = temp.next;
        }
        
        head = stack.pop();
        temp = head;
        while(!stack.isEmpty()) {
        		temp.next = stack.pop();
        		temp = temp.next;
        }
        temp.next = null;
        
        return head;
    }

}
