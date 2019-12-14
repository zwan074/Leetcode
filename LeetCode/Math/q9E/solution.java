package q9E;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import q589E.Node;
import q690E.Employee;

public class solution {
	public boolean isPalindrome(int x) {
		String number = String.valueOf(x);
	
		for ( int i = 0 ; i < number.length()/2 ; i++) {
			
			if (number.charAt(i) != number.charAt(number.length()-1-i)) return false;
			
		}
		
		
		return true;
    }
	


}
