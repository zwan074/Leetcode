/*You are given two non-empty linked lists representing two non-negative integers. 

The digits are stored in reverse order and each of their nodes contain a single digit. 

Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.*/

package add_two_numbers_2;

import java.util.Iterator;
import java.util.LinkedList;

public class solution1 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
		Iterator i1 = l1.iterator();
		Iterator i2 = l2.iterator();
		
		LinkedList l = new LinkedList();
		
		int carry = 0 ;
		
		while(i1.hasNext() && i2.hasNext()) {
			
			int a = (int) i1.next();
			int b = (int) i2.next();
			int c = a + b;
			
			if (  c < 10 ) {
				int sum = c + carry;
				l.add( sum );
				
				carry = 0;
			}
			
			else {
				int sum = c - 10 + carry;
				l.add ( sum ) ; 
				carry = 1;
						
			}
			
				
			
		}
		
		return l;
        
    }

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.add(9);
		l1.add(4);
		l1.add(3);
		
		l2.add(5);
		l2.add(6);
		l2.add(4);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(addTwoNumbers(l1,l2));
	}

}
