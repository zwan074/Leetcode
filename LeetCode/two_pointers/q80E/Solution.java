package q80E;


public class Solution {
	
	public int removeDuplicates(int[] nums) {
		
		int A = 0;
		boolean twice = false;
		
		for (int i = 1 ; i < nums.length ; i++) {
			
			if ( nums[A] == nums[i] && !twice) {
				A++;
                nums[A] = nums[i];
				twice = true;
			}

			else if ( nums[A] != nums[i] ) {
				
				A++;
				nums[A] = nums[i];
				twice = false; 
			}
			
			
			
		}
		
		
		
		return A;
        
    }
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int[] nums = {0,2,2,2,1};
		
		s.removeDuplicates(nums);
	}

}
