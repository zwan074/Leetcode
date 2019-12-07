package q989E;

import java.util.ArrayList;
import java.util.List;


public class Solution {
	public List<Integer> addToArrayForm(int[] A, int K) {
        
		int int_A =  0 ;
		List<Integer> L = new ArrayList<>();
		
		String KS = "" + K;
		int carry = 0 ;
		
		if ( KS.length() >= A.length) {
			for (int i = 0 ; i < A.length ; i++) {
				
				int_A += A[i] * Math.pow(10.0, A.length-1-i); 
				
			}
			
			int_A += K;
			String ans = "" + int_A;
			
			for (int i = 0 ; i < ans.length() ; i++) {
				
				L.add(Integer.parseInt(ans.substring(i, i+1)) );
				
			}
			
			
		}
		else {
			
			for (int i = 0 ; i < A.length ; i++) {
				
				if (KS.length()-1-i >=0) {
					
					if (A[A.length-1-i] + Integer.parseInt(String.valueOf(KS.charAt(KS.length()-1-i))) + carry < 10  ) {
						
						A[A.length-1-i] = A[A.length-1-i] + Integer.parseInt(String.valueOf(KS.charAt(KS.length()-1-i))) + carry ;
						carry = 0;					
						
					}
					
					else if (A[A.length-1-i] + Integer.parseInt(String.valueOf(KS.charAt(KS.length()-1-i))) + carry >= 10 ) {
						
						A[A.length-1-i] = (A[A.length-1-i] + Integer.parseInt(String.valueOf(KS.charAt(KS.length()-1-i))) + carry) % 10 ;
						carry = 1;	
					}
					
					
				}
				
				else {
					
					if (A[A.length-1-i] + carry < 10 ) {
						
						A[A.length-1-i] =A[A.length-1-i] + carry ;
						carry = 0;	
					}
					  
					else if (A[A.length-1-i] + carry >= 10 ) {
						
						A[A.length-1-i] = (A[A.length-1-i] + carry) % 10 ;
						carry = 1;	
					}
					
					
				}
				
				
				
				
			}
			if (carry == 1) {
				L.add(1);
			}
			
			
			for (int i = 0 ; i < A.length ; i++) {
				
				L.add(A[i]);
				
			}
			
			
		}
		
		

		
		return L;
		
		
    }
    
    public static void main(String[] args) {

    	Solution s = new Solution() ;
    	int[] a = {9,9,9,9,9,9,9,9,9,9};
    	int b = 1;
    	System.out.print(s.addToArrayForm(a, b));
    }
}
