package q430E;


public class Solution {
	public Node flatten(Node head) {
		
		if (head == null) return null;
		if (head.next == null) return head;

		boolean hasNext = true;
		Node next = head;
		
		while (hasNext) {
			
			if ( next.child == null && next.next == null) {
				hasNext = false;
			}

			else if (next.child == null && next.next != null) {
				next = next.next;
				
			}
			
			else {
				mergeSubLine (next);
				
			}
			
			
		}
		
		
		
		
		
		return head;
        
    }
	
	void mergeSubLine (Node n) {
		
		
		
		if (n.next == null) {
			n.next = n.child;
			n.child = null;
			n.next.prev = n;
		}
		
		else {
			
			boolean hasNext = true;
			Node mainLineNext = n.next;
			
			n.next = n.child;
			n.child = null;
			n.next.prev = n;
			
			Node next = n;
			
			while (hasNext) {

				next = next.next;
				if (next.next == null) {
					hasNext = false;
					next.next = mainLineNext;
					mainLineNext.prev = next;
				}

				
			}
		}
		
		
		
		
		
	}
	 
	public static void main(String[] args) {

	}

}
