package q687E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class solution {
	
	
	public int longestUnivaluePath(TreeNode root) {
        
		int depth = 1;
		
		
		return DFS ( root , depth);
    }
	
	int DFS (TreeNode root , int d) {
		
		if (root.left !=null && root.val != root.left.val) {
			System.out.println("left " + d + " " + root.val);
			DFS (root.left ,  d++);
		}
		if (root.right !=null && root.val != root.right.val) {
			System.out.println("right " + d + " " + root.val);
			DFS (root.right ,  d++);
		}
		return d;
	}
	
}
