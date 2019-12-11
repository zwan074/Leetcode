package q26E;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Generate_Parentheses_22.solution;

public class Solution {
	
	public int removeDuplicates(int[] nums) {
		
		int A = 0;
		
		for (int i = 0 ; i < nums.length ; i++) {
			
			if ( nums[A] != nums[i] ) {
				
				A++;
				nums[A] = nums[i];
				
			}
			
			
			
		}
		
		
		
		return A;
        
    }
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int[] nums = {0,2,2,2,1};
		
		s.removeDuplicates(nums);
	}

}
