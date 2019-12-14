package q430E;

import java.util.Stack;

public class Solution {
	public Node flatten(Node head) {
		
		if (head == null) return null;
		if (head.next == null) return head;

		Stack<Node> stack = new Stack<>();
		Node next = head;
		
		while (next != null || !stack.isEmpty() ) {
			
			System.out.println(next.val);
			if (next.child == null && next.next != null) {
				next = next.next;
			}
			else if ( next.child!= null && next.next == null) {
				
				next.next = next.child;
				next.child.prev = next;
				next.child = null;
				next = next.next;
				
			}
			else if(next.child !=null) {
				stack.push(next.next);
				for(Node n : stack) {
					 System.out.print(n + " ");
				}
				next.next = next.child;
				next.child.prev = next;
				next.child = null;
				next = next.next;
			}
			
			else if (next.next == null) {
				
				if (stack.size() > 0) {
					Node conn = stack.pop();
					next.next = conn;
					conn.prev = next;
					next =conn;	
				}
					
				
			}
		}
		
		
		return head;
        
    }
	
	

}
