/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5


 */


package Median_of_Two_Sorted_Arrays_4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public double findMedianSortedArrays(int[] nums1, int[]  nums2) {
		
		List<Integer> nums = new ArrayList<Integer>();
		
		for ( Integer n:nums1) {
			
			nums.add(n);
	
		}

		for (Integer n:nums2) {
			
			nums.add(n);
			
		}
		
        	Collections.sort(nums);
        
		return (nums.size() %2 == 0) ? (nums.get(nums.size()/2) + nums.get(nums.size()/2 -1 )) / 2 : nums.get(nums.size()/2);
		
		
	}
    }
		
	
	
	public static void main(String[] args) {
		
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(findMedianSortedArrays (nums1,nums2));
	}

}
