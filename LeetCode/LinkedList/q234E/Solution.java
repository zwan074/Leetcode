package q234E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Solution {
	
	public boolean isPalindrome(ListNode head) {
        List<Integer> l = new ArrayList<>();
        
        ListNode curr = head;
        
        while (curr != null) {
        	l.add(curr.val);
        	curr = curr.next;
        }
        if (l.size()%2 != 0 ) return false;
        	
        for ( int i = 0 , j = l.size()-1; i < l.size()/2 ; i++,j--  ) {
        	
        	if(!l.get(i).equals( l.get(j))) return false;
        	
        }
        
        
        return true;
        
    }

}
