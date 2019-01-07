/*
 
 Determine whether an integer is a palindrome. An integer is a palindrome when it reads the 
 same backward as forward.

Example 1:

Input: 121
Output: true

Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. 
Therefore it is not a palindrome.

Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 */

package Palindrome_Number_9;

public class Solution {
	public static boolean isPalindrome(int x) {
		
		StringBuilder s = new StringBuilder ();
		s.append(x);
		s.reverse();
		
		if (x<0) {
			
			return false;
		}
		
		else {
			if ( Integer.parseInt(s.toString()) == x ) {
				
				return true;
			}
			
			else {
				
				return false;
			}
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

}
