package q21E;


public class Solution {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    if (l1 == null && l2 == null) return null;
	    if (l1 == null && l2 != null) return l2;
	    if (l1 != null && l2 == null) return l1;
	    
		ListNode L1 = l1.val <= l2.val ? l1 : l2;
		ListNode L2 = l1.val <= l2.val ? l2 : l1;
		
		while (L1 != null) {
			
			if (L1.next == null) {L1.next = L2; break;}
			else if (L2 == null || L1.next.val < L2.val ) L1 = L1.next;
			else if (L1.val <= L2.val && L1.next.val >= L2.val ) {
				ListNode l1Next = L1.next;
				ListNode l2Next = L2.next;
				
				L1.next = L2;
				L2.next = l1Next;
				
				L2 = l2Next;

				
			}
			
			
		}

		
		return l1.val <= l2.val ? l1 : l2;
		
		
		
		
	}

}
