package q240M;

public class solution {
	
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0) return false;
		int row_len = matrix.length,col_len = matrix[0].length;
		
		for (int i = 0 ; i < row_len ; i++) {
			
			if (  matrix[i].length > 0  && target >= matrix[i][0] && target <= matrix[i][col_len-1]   ) {
				
				int index = Bsearch ( matrix[i], target);
				
				if (index != -1) {
					return true;
				}
				
			}
			
			
		}
		
		return false;
        
    }
	
	int Bsearch (int[] numbers, int target) {
		
		int low = 0, high = numbers.length - 1 , mid = 0;
		
		while (low <= high) {
			mid = (low + high) / 2;
			
			if (numbers[mid] == target ) 
				return mid; 
			else if (numbers[mid] < target ) 
				low = mid+1;
			else 
				high = mid-1;
			
			
		}
		
		
		return -1;
		
	}

}
