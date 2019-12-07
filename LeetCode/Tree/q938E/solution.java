package q938E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solution {
	
	int sum = 0;
	
	public int rangeSumBST(TreeNode root, int L, int R) {
		
		traverseTree (root,  L,  R) ;
		
		return sum;
	
	}
	
	void traverseTree (TreeNode n, int L, int R) {
		
		if (n == null) return;
		if ( n.val >= L && n.val <= R) sum += n.val;
		
		traverseTree(n.left, L , R); 
		traverseTree(n.right, L ,R);
		
		
		
	}

}
