package q108E;

import java.util.Arrays;

public class solution {
	
	
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) return null;
		TreeNode t = new TreeNode ( nums[nums.length/2]);
		BST( nums ,  t);
		return t;
		 
    }
	
	public TreeNode BST(int nums[] , TreeNode t) {
		
		for (int i : nums) {
			System.out.print(i + " " );
			
		}
        System.out.println(nums.length);
		if(nums.length == 0) return null;
		
		
		int[] left = Arrays.copyOf(nums, nums.length/2  );
		int[] right = Arrays.copyOfRange(nums, nums.length/2 + 1 , nums.length );
		
		
		if(left.length > 0 ) t.left = new TreeNode ( left[left.length/2]  ) ;
		if(right.length > 0) t.right = new TreeNode ( right[right.length/2]  ) ;
		
		
		BST(left,t.left);
		BST(right,t.right);
		
		return t;
	}

}
