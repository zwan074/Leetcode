package q931M;

public class solution {
	
	public int minFallingPathSum(int[][] A) {
		
		
		int[][] dp = new int[A.length][A.length];
		
		for (int j = 0 ; j < A.length ; j ++) {
			
			dp[0][j] = A[0][j];
			
		}
		
		if ( A.length ==  1) return getMin(dp[0]); 
		
		
		for (int i = 1 ; i < A.length ; i ++) {
			for (int j = 0 ; j < A.length ; j ++) {
				if (j==0) dp[i][j] = A[i][j] + Math.min(dp[i-1][j], dp[i-1][j+1]) ;
				else if (j==A.length-1) dp[i][j] = A[i][j] + Math.min(dp[i-1][j], dp[i-1][j-1]) ;
				else dp[i][j] = A[i][j] + Math.min( dp[i-1][j-1],Math.min(dp[i-1][j], dp[i-1][j+1]) );
			}
		}
		
		return getMin(dp[A.length]);
        
    }
	
	int getMin( int[] B ) {
		
		int min = Integer.MAX_VALUE;
		
		for (int i : B) {
			if(i < min) min = i;
		}
		return min;
		
	}

}
