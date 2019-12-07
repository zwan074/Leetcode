package q121E;

public class solution {
	
	public int maxProfit(int[] prices) {
		
		int minPrice = Integer.MAX_VALUE, maxProfit = 0 ;
		
		for (int i = 0 ; i < prices.length ; i++) {
			
			if (prices[i] < minPrice) minPrice = prices[i];
			maxProfit = Math.max( maxProfit , prices[i] - minPrice ); 
			
		}
		
		
		
		
		return maxProfit;
        
    }

}
