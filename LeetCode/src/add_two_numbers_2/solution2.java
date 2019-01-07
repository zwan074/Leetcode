package add_two_numbers_2;

import Remove_Nth_Node_From_End_of_List_19.ListNode;

public class solution2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		
		ListNode first1 = l1;
		ListNode first2 = l2;
		ListNode l = new ListNode(0);
		
		int carry = 0 ;
		int sum = l1.val + l2.val;
		
		if (sum>10) { l = new ListNode(sum-10); carry = 1;}
		else { l = new ListNode(sum);}
		
		ListNode curr = l;
		while (first1.next != null && first2.next != null) {
		
			if (  first1.next.val + first2.next.val  < 10 ) {
				sum = first1.next.val + first2.next.val + carry ;
				first1 = first1.next;
				first2 = first2.next;
				curr.next = new ListNode(sum);
				curr = curr.next;
				carry = 0;
			}
			
			else {
				
			
				sum = first1.next.val + first2.next.val - 10 + carry;
				first1 = first1.next;
				first2 = first2.next;
				curr.next = new ListNode(sum);
				curr = curr.next;
				carry = 1;
						
			}
			
			
		}
		
		return l;
		
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
