package q53E;

public class solution {
	
	public int maxSubArray(int[] nums) {
        
		int[] sums = new int[nums.length];
		sums[0] = nums[0];
		int max = sums[0];
		
		
        for (int i = 1 ; i < nums.length ; i++) {
        	
        	sums[i] = sums[i-1] > 0 ? sums[i-1] : 0  + nums[i];
        	max = Math.max(sums[i], max);
        	
        	
        }
		
		
		return max;
    }

}
