package q905E;

import java.util.ArrayList;
import java.util.List;


public class Solution {
	public int[] sortArrayByParity(int[] A) {
        
		int j = 0;
		
		for (int i = 0 ; i < A.length; i++) {
			
			if (A[j] % 2 == 0) {
				j++;
			}
				
			else if ( A[i] % 2 == 0 && A[j] % 2 != 0  ) {
				
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				j++;
			}
				
			
			
		}
		
		return A;
		
    }
}
