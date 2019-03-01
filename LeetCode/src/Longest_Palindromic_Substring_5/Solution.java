/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:

Input: "cbbd"
Output: "bb"


 */

package Longest_Palindromic_Substring_5;

public class Solution {
	

	public String longestPalindrome(String s) {
        
		if (s.length() == 0) return s;
		
        	String mem = s.substring(0,1);
		String longestSubstring;

		for (int i = 0; i < s.length() - 1 ;i++) {
			for ( int j = s.length()-1 ; j > i ;j--) {
                
				longestSubstring = s.substring(i,j+1);
                
				if ( longestSubstring.length() < mem.length() ) {break;} 
				
                if (isPalindrome(longestSubstring) && longestSubstring.length() >= mem.length()) {
                   
                    mem = longestSubstring;
                    break;
                
                }
			}	
		}
		
		
		return mem ;
    }
		
	private boolean isPalindrome(String s){
        
        if ( s.length() % 2 == 0 ) {
        	
        	String left = s.substring(0,s.length()/2);
        	String right = s.substring(s.length()/2,s.length());
        	int i = 0 , j = left.length()-1; 
        	while ( i < left.length()  ) {
        		
        		if ( left.charAt(i) != right.charAt(j) ) {
        			return false;
        			
        		}
        		
        		i++;
        		j--;
        	}
        	
        	return true;
        	
        }
        
        else {

        	String left = s.substring(0,s.length()/2);
        	String right = s.substring(s.length()/2+1,s.length());
        	int i = 0 , j = left.length()-1; 
        	while ( i < left.length()  ) {
        		
        		if ( left.charAt(i) != right.charAt(j) ) {
        			return false;
        			
        		}
        		
        		i++;
        		j--;
        	}
        	
        	return true;
        	
        	
        	
        }
    
        
        
        
    }
		
	public static void main(String[] args) {
		Solution ans = new Solution();
		String test = "abbbbbba";
		System.out.println(ans.longestPalindrome(test));
		

	}

}
