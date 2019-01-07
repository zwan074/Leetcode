/*
 Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment 
which could only store integers within the 32-bit signed 
integer range: [−231,  231 − 1]. For the purpose of this problem, 
assume that your function returns 0 when the reversed integer overflows.

 */

package reverse_integer_7;

public class Solution {
	public static int reverse(int x)  {
		final double INT_MAX = Math.pow(2, 31)- 1;
		final double INT_MIN = Math.pow(2, 31) * -1 ;
		
		String y = "" + x;  
		StringBuilder rev_y = new StringBuilder(y.length());
		rev_y = rev_y.append(y);
		
		if ( x > 0 ) {
			
			
			long ret = Long.parseLong (rev_y.reverse().toString());
			
			if (ret > INT_MAX ) {
				
				return 0 ;
				
			}
			else {
				
				return (int) ret;
			}
		}
		
		else {
			rev_y.deleteCharAt(0);
			long ret = -1 * Long.parseLong (rev_y.reverse().toString());
			
			if (ret < INT_MIN ) {
				
				return 0 ;
				
			}
			else {
				
				return (int) ret;
			}
			
		}
		
		
		
        
    }
	public static void main(String[] args) {
		System.out.println(reverse(1811199999) );
		System.out.println(reverse(-1811199999) );
	}

}
