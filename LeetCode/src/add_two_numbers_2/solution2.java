package add_two_numbers_2;

import Remove_Nth_Node_From_End_of_List_19.ListNode;

public class solution2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
		    int x = (p != null) ? p.val : 0;
		    int y = (q != null) ? q.val : 0;
		    int sum = carry + x + y;
		    carry = sum / 10;
		    curr.next = new ListNode(sum % 10);
		    curr = curr.next;
		    if (p != null) p = p.next;
		    if (q != null) q = q.next;
		}
		if (carry > 0) {
		    curr.next = new ListNode(carry);
		}
		return dummyHead.next;
		
	}
	
	public static void main(String[] args) {
		ListNode l10 = new ListNode(3);
		ListNode l11 = new ListNode(4);
		ListNode l12 = new ListNode(2);
		l10.next = l11;
		l11.next = l12;
		
		ListNode l20 = new ListNode(4);
		ListNode l21 = new ListNode(6);
		ListNode l22 = new ListNode(5);
		l20.next = l21;
		l21.next = l22;
		ListNode l = addTwoNumbers (l10,l20) ;
		ListNode first = l;
		while (first != null) {
			System.out.println(first.val);
			first= first.next;
		}
		
		
		
	}
	
}
