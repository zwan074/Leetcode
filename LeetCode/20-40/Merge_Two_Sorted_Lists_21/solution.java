/*
 21. Merge Two Sorted Lists
Easy

Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

 
 
 */

package Merge_Two_Sorted_Lists_21;

public class solution {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

	    ListNode temp = new ListNode();

	    if ( l1 == null || l2 == null) {return l1;}

	    while ( l1.next != null ) {
	        if ( l2 == null) {
	       	    return l1;
		}

		if ( l1.val <= l2.val && l1.next.val > l2.val) {

		    temp = l2;
		    l1.next = temp;
		    temp.next = l1.next.next;

		    l1 = l1.next;
		    l2= l2.next;


		}

		else{
		    l1 = l1.next;    
		}

	    }    

	    if ( l2 != null ) { l1.next = l2; }
	    return l1;
        }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
