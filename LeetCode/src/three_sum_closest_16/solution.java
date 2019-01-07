
/*

Given an array nums of n integers and an integer target, find three integers in nums 
such that the sum is closest to target. Return the sum of the three integers.
You may assume that each input would have exactly one solution.

Example:

Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).



 */

package three_sum_closest_16;

public class solution {
	public static int threeSumClosest(int[] nums, int target) {
        
		int threeSumClosest = 50000;
		
		for (int i = 0; i < nums.length; i++ ) {
			for (int j =0; j < nums.length ; j++ ) {
				for (int k =0; k < nums.length ; k++ ) {
					if ( i == j ) {continue;}
					else if ( k == j ) {continue;}
					else if ( i == j ) {continue;}
					if ( target - (nums[i] + nums[j] + nums[k]) < Math.abs(threeSumClosest) ) {
						
						threeSumClosest = Math.abs (target - (nums[i] + nums[j] + nums[k])) ;
					}
					
					//System.out.println("" + nums[i] + nums[j] + nums[k]);
					
				}
				
		
		    }
		}		
		return threeSumClosest;
    }
	public static void main(String[] args) {
		int[] x = {-1, 2, 1, -4};
		System.out.println(threeSumClosest(x,1));

	}

}
