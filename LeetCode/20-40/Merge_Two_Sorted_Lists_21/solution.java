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
    	 
    	ListNode head = null;
        if (l2 == null) {return l1;}
        if (l1 == null) {return l2;}
        
        if (l1.val > l2.val) {
        	//System.out.println(" swap here" );
        	return mergeTwoLists ( l2, l1);
        	
        }
        
        else {

        	head = l1;
        	//System.out.println("there" );
        	
        	while ( l1.next != null ) {
              	 
            	if ( l2 == null) {
            		return head;
            	}

            	if ( l1.val <= l2.val && l1.next.val > l2.val) {
            	 
            		ListNode temp = new ListNode(l2.val) ;
            		temp.next = l1.next;
    	            l1.next = temp;
    	              
    	            l1 = temp;
    	            l2 = l2.next;
                
            	}	
              
    	        else {  
    	            l1 = l1.next;    
    	        }
            	
            
            }  
        	
            if ( l2 != null ) { l1.next = l2; }

        	System.out.println("finish loop " );
    	    return head;
        }
    	
      
      
	    
    }
	public static void main(String[] args) {
		solution s = new solution();
		 
		ListNode a1 = new ListNode(0);
		ListNode a2 = new ListNode(0);
		ListNode a3 = new ListNode(0);
		a1.val = 1;
		a2.val = 2;
		a3.val = 4;
		a1.next = a2;
		a2.next = a3;
		a3.next =null;
		
		ListNode b1 = new ListNode(0);
		ListNode b2 = new ListNode(0);
		ListNode b3 = new ListNode(0);
		b1.val = 1;
		b2.val = 3;
		b3.val = 4;
		b1.next = b2;
		b2.next = b3;
		b3.next = null;
		
		ListNode h = s.mergeTwoLists(a1,b1);
		
		 ListNode first = h;
		while (first != null) {
			System.out.println(first.val);
			first= first.next;
		}
		 
		
		
	}

}
