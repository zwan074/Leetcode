/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/



package two_sums_1;

import java.util.Arrays;
import java.util.HashMap;

public class solution1 {
	
	 public static int[] twoSum(int[] nums, int target) {
	        
		public int[] twoSum(int[] nums, int target) {
        	HashMap<Integer,Integer> hm = new HashMap<>();
		int i =0; 
		
		for ( int n : nums) {
			
			hm.put(n, i);
			i++;
		}
		
		
		for (i =0; i < nums.length; i++ ) {
			
			if ( hm.containsKey(target - nums[i]) && hm.get(target - nums[i]) != i ) {
				
				int value = target - nums[i];	
				int[] index = {i, (int) hm.get(value)};
				return index;
				
			}
			
			
			
		}
		
		int[] index =  {-1,-1};
		return index;
    }
		
	}
	 
	
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 18;
		System.out.print(Arrays.toString(twoSum(nums, target)));


	}
}
