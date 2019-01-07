/*
 
 Given an array nums of n integers, are there elements a, b, c 
 in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]


 */

package three_sums_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solution {
	public static List<List<Integer>> threeSum(int[] nums) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		List<List<Integer>> ret = new ArrayList<List<Integer>>(); 
		int i =0;
		for ( int n : nums) {
			
			hm.put(n, i);
			i++;
		} 
		
		for (i = 0; i < nums.length; i++ ) {
			int target = 0 - nums[i] ;
			for (int j =0; j < nums.length ; j++ ) {
				if ( i == j ) {continue;}
				if ( hm.containsKey(target - nums[j]) && 
						hm.get(nums[j]) != hm.get (target - nums[j]) &&
						hm.get (target - nums[j]) != i)  {
					
					int value = target - nums[j];	
					int[] index = {j, (int) hm.get(value)};
					
					List<Integer> ans = new ArrayList<>(); 
					ans.add(nums[i]);
					ans.add(nums[index[0]]);
					ans.add(nums[index[1]]);
					
					
					ret.add( ans);	
						
				    
				}
				
			}
			
			
		}

		
		for ( List<Integer> o: ret  ) {
			
			o.sort(null);

		}
		

		Set<List<Integer>> set = new HashSet<>(ret);
		List<List<Integer>> ret2 = new ArrayList<List<Integer>>(set); 
		
		return ret2;
	}
	public static void main(String[] args) {
		int[] a = {-1, 0, 1, 2, -1, -1,2 ,8,-8,-4};
		System.out.print(threeSum (a));

	}

}
