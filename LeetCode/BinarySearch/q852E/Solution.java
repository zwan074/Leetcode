package q852E;


public class Solution {
	
	public int peakIndexInMountainArray(int[] A) {
        
		int s = 0 ,e = A.length, mid = 0;
		
		while (s <= e) {
			
			System.out.println(s + " " +  e);
			mid = (s + e) / 2 ;
			if(s == 0 && e == 1) return 1;
			if  ( A[mid] > A [mid - 1] && A[mid] > A[mid+1] ) 
				break;
			else if (  A[mid] > A [mid - 1] && A[mid] < A[mid+1]   ) 	
				s = mid + 1;
			else 
				e = mid -1;
			
			
		}
		
		return mid;
		
    }
	
	
	
	

}
