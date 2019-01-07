package Remove_Nth_Node_From_End_of_List_19;

public class solution2 {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		
		ListNode first = head;
		int length = 0 ; 
		while (first.next != null) {
			length++;
			first = first.next;
			
		}
		
		first = head; 
		
		if ( n < length ) {
			length -= n;
			
			while (length > 0 ) {
				length--; 
				first = first.next;
				
			}
			first.next = first.next.next;
			return head;
			
		}
		
		else {
			
			head = head.next;
			return head ;
		}
		
		
		
	}
	public static void main(String[] args) {
		ListNode h1 = new ListNode(1);
		ListNode h2 = new ListNode(2);
		ListNode h3 = new ListNode(3);
		ListNode h4 = new ListNode(4);
		ListNode h5 = new ListNode(5);
		
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = h5;

		ListNode h = removeNthFromEnd(h1,2);
		ListNode first = h;
		while (first != null) {
			System.out.println(first.val);
			first= first.next;
		}

	}

}
