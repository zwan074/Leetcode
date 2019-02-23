package Merge_k_Sorted_Lists_23;

public class merge_2_lists {
	
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

        	//System.out.println("finish loop " );
    	    return head;
        }
    	
      
      
	    
    }
}
