/*Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/




package Longest_substring_no_repeat_3;

public class solution1 {
	
	public static int lengthOfLongestSubstring(String s) {
		
		String mem = "";
		int count = 0;
		int longestSubstring = 0;
		
		
		for (int i = 0; i< s.length();i++) {
			
			if ( !mem.contains( s.substring(i, i+1) ) ) {

				mem += s.substring(i,i+1);
				count = mem.length();
				System.out.println(mem);
				if (longestSubstring < count ) {
					
					longestSubstring = count;
					
				}
				
			}
			
			else {
				
				count=0;
				mem= "";
				
			}
			
		}
		
		
		return longestSubstring;
        
    }
	public static void main(String[] args) {
		//System.out.println(lengthOfLongestSubstring("bbbbb" ));
		System.out.println(lengthOfLongestSubstring("pwwkewabcdfghijlmm" ));
	}

}
