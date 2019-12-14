package q141E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	
	public boolean hasCycle(ListNode head) {
        Set<ListNode> l = new HashSet<>();
        
        ListNode curr = head;
        
        while (curr != null) {
        	l.add(curr);
        	if (l.contains(curr.next)) return true;
        	curr = curr.next;
        	
        }
        	
        return false;
        
    }

}
