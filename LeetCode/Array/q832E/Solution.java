package q832E;

import java.util.ArrayList;
import java.util.List;


public class Solution {
	 public int[][] flipAndInvertImage(int[][] A) {
		 
		 int[][] B = new int[A.length][A[0].length];
		 
		 for (int i = 0 ; i < A.length; i++) {
			 for(int j = 0 ; j < A[0].length; j++) {
				 
				 B[i][A[0].length - 1 -j] = A[i][j] == 0 ? 1 : 0;
				 
				 
			 }
			 
			 
		 }
		 
		 return B;
		 
	 }
}
