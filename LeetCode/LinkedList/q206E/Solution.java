package q206E;


public class Solution {
	public ListNode reverseList(ListNode head) {
		
		ListNode curr = head;
		ListNode prev = null;
		
		while ( curr != null ) {
			
			ListNode tempNext = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tempNext;
			
			
		}
		
		return prev;
		
    }

}
