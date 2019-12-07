package q746E;

public class solution {
	
	public int minCostClimbingStairs(int[] cost) {
		
		int[] dp = new int[cost.length+1];
		
		dp[1] = cost[0];
		dp[2] = Math.min(cost[0],cost[1]);
		
		for (int i = 3 ; i < cost.length+1 ; i ++) {
			dp[i] = Math.min(dp[i-1] , dp[i-2] + Math.min(cost[i-1], cost[i-2]));
			
		}
		
		
		
		
		
		return dp[cost.length];
        
    }

}
