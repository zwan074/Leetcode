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
		
		String mem = "";
		String longestSubstring = s.substring(0,1);

		
		for (int i = 0; i < s.length() - 1 ;i++) {
			for ( int j = i+1 ; j < s.length();j++) {
				//System.out.println("longestSubstring:"+longestSubstring + " " + i);
				//System.out.println("mem:"+mem+ " " + j);
				if ( !longestSubstring.substring(0,1).equals( s.substring(j, j+1) ) ) {

					longestSubstring += s.substring(j,j+1);
					
					if (longestSubstring.length() == s.length()) {
						longestSubstring= s.substring(i+1,i+2);
						break;
					}
					
					
					
				}
				
				else {
					
					if (longestSubstring.length() > mem.length() - 1 ) {
						
						mem = longestSubstring + longestSubstring.substring(0,1) ;
						
					}
					
					longestSubstring= s.substring(i+1,i+2);
					
					break;
				}
				
				
			}
			
			
		}
		
		
		return mem ;
    }
	public static void main(String[] args) {
		String test = "cbaabaaaaaaaabcd";
		Solution a = new Solution();
		System.out.println(a.longestPalindrome(test));
		

	}

}
