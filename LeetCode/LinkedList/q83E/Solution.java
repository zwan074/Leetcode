package q83E;


public class Solution {
	public ListNode deleteDuplicates(ListNode head)  {
		
		if (head == null) return head;
		ListNode curr = head;
			
		while ( curr.next != null ) {
			
			if (curr.next.val == curr.val) curr.next = curr.next.next;
			else curr = curr.next;
			
			
		}
		
		return head;
		
    }

}
