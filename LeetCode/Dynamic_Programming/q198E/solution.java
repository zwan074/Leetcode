package q198E;

public class solution {
	
	public int rob(int[] nums)	 {
		
		int[] dp = new int[nums.length+2];
		
		for (int i = 0 ; i < nums.length ; i++) 
			dp[i+2] = Math.max(dp[i] + nums[i] , dp[i+1]);
				
       return  dp[dp.length - 1];
    }

}
