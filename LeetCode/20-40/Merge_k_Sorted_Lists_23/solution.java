/*
 
 Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6


 */

package Merge_k_Sorted_Lists_23;

import java.util.ArrayList;
import java.util.List;


public class solution {
	
	public ListNode mergeKLists(List<ListNode> lists) {
        
		merge_2_lists merge_2_lists = new merge_2_lists();
		List<ListNode> l = new ArrayList<>();
		
		
		for ( int i = 0 ; i < lists.size()-1 ; i += 2) {
			
			l.add(merge_2_lists.mergeTwoLists(( ListNode)lists.get(i), ( ListNode)lists.get(i+1) ) );
			
		}
		
		if (lists.size() == 3) { l.add((ListNode) lists.get(2)); }
		if (l.size() == 1) {  return (ListNode) l.get(0) ; }
	
		 
		if ( l.size() % 2 == 0 ) { 
			return mergeKLists(l); }
		else { 
			l.add( (ListNode) lists.get(lists.size()-1)); 
			return mergeKLists(l); }

		
		
		
    }
	
	public static void main(String[] args) {
		solution s = new solution();
		 
		ListNode a1 = new ListNode(2);
		ListNode a2 = new ListNode(4);
		ListNode a3 = new ListNode(5);
		a1.next = a2;
		a2.next = a3;
		a3.next =null;
		
		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(3);
		ListNode b3 = new ListNode(4);
		b1.next = b2;
		b2.next = b3;
		b3.next = null;
		
		ListNode c1 = new ListNode(2);
		ListNode c2 = new ListNode(6);
		c1.next = c2;
	
		List<ListNode> lists = new ArrayList<>();
		lists.add(a1);
		lists.add(b1);
		lists.add(c1);
		
		ListNode h = s.mergeKLists(lists);
		
		ListNode first = h;
		while (first != null) {
			System.out.println(first.val);
			first= first.next;
		}
		 
		
		
	}

}
