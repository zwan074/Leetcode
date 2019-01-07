/*
 
 
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */

package Longest_Common_Prefix_14;

public class Solution {
	public static String longestCommonPrefix(String[] strs) {
        
		String shortestString = strs[0];
		String prefixString = "";
		boolean hasLCP = true;
		
		for (int i =0; i < strs.length;i++) {
			
			if ( strs[i].length() < shortestString.length() ) {
				
				shortestString = strs[i];
				
			}	
			
        }	

		for (int i =0; i < shortestString.length()-1;i++) {
			for (int j =i+1; j < shortestString.length();j++) {
				//System.out.println(prefixString);
				for (int k =0; k < strs.length;k++)  {
		
					if (strs[k].contains(shortestString.substring(i, j+1)) ) {hasLCP = hasLCP && true;}
					else {hasLCP = false; break;}
					
				}
				//System.out.println(hasLCP);
				if (hasLCP && prefixString.length() < shortestString.substring(i, j+1).length()) {
					
					prefixString = shortestString.substring(i, j+1);
	
				}
				
				else {
					hasLCP = true;
					break;
				}
				
			}
        }
		return prefixString;
		
    }
	public static void main(String[] args) {
		String[] a = {"fxlower","falowe","fwloweight"};
		System.out.println( longestCommonPrefix(a) );

	}

}
