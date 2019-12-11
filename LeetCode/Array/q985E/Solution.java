package q985E;

public class Solution {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		
		int B[] = new int[queries.length+1];
		B[0] = 0 ;
		for (int e : A) {
			if ( e%2 == 0) B[0] = B[0] + e;
		}
		
		for (int i = 0 ; i < queries.length ; i++) {
			
			int index = queries[i][1] , value = queries[i][0];
			
			int pre = i == 0 ? 0 : i -1 ; 
			System.out.println(index);
			if (  A[index] % 2 == 0 ) {
				
				if ((A[index] + value)  % 2 == 0 ) 
					B[i] = B[pre] + value;
				else 
					B[i] = B[pre] - A[index];
				
			}
			
			else {
				
				if ( (A[index] + value)  % 2 == 0 ) 
					B[i] = B[pre] + A[index] + value;
				else 
					B[i] = B[pre];

			}
			 A[index] = A[index] + value;
			
		}
		
		
		return B;
        
    }
}
