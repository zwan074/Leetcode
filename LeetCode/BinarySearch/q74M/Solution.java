package q74M;


public class Solution {
	
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0) return false;
		int row_len = matrix.length,
			col_len = matrix[0].length,
			low = 0,
			high = row_len * col_len-1,
			mid = 0;
		
		while (low <= high) {
			mid = (low + high) / 2;
			
			if (matrix [mid/col_len][mid%col_len] == target) 
				return true; 
			else if (matrix [mid/col_len][mid%col_len] < target) 
				low = mid+1;
			else 
				high = mid-1;
			
			
		}
		
		
		
		return false;
        
    }
	
	
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int[][] matrix =  {
		                   {1,   3,  5,  7},
		                   {10, 11, 16, 20},
		                   {23, 30, 34, 50}};
		
		System.out.print(s.searchMatrix(matrix, 4));
		

	}

}
