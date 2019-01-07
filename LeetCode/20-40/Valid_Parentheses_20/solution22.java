/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 

determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true

Example 2:

Input: "()[]{}"
Output: true

Example 3:

Input: "(]"
Output: false

 */

package Valid_Parentheses_20;

import java.util.HashMap;
import java.util.Stack;

public class solution22 {
	
	public boolean isValid(String s) {
	    
		Stack<String> a = new Stack<>();
		HashMap <String,String> hm = new HashMap<>();
		
		hm.put("(",")");
		hm.put(")","(");
		hm.put("{","}");
		hm.put("}","{");
		hm.put("[","]");
		hm.put("]","[");
		
		a.push(s.substring(0,1));

		for ( int i = 1; i < s.length(); i ++) {
			String b = s.substring(i,i+1);
			System.out.println(a);
			
			if ( a.peek().equals(hm.get(b)) && a.size() > 0) {
				a.pop();
				
			}
			else {
				a.push(s.substring(i,i+1));
			}
			
		}
		
		return a.isEmpty();
		
		
	}
	
	public static void main(String[] args) {
		solution22 a = new solution22();
		
		System.out.println( a.isValid("({})") );

	}

}