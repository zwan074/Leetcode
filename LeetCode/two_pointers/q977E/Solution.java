package q977E;


public class Solution {
	
	public int[] sortedSquares(int[] A) {
        
		for (int i = 0 ; i < A.length ; i++) {
			A[i] = A[i] * A[i];
		}
		
		for (int i = 1; i < A.length; i++) {
		    for (int j = i - 1; j >= 0 && A[j] > A[j + 1]; j--)
		      swap(A, j, j + 1);
		 }
		return A;
		
    }
	 
	void swap(int[] a, int left, int right) {
	    int rightValue = a[right];
	    a[right] = a[left];
	    a[left] = rightValue;
	}
	
	public static void main(String[] args) {

	}

}
