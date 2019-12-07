package q653E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solution {
	
	List<Integer> L = new ArrayList<>();
	
	public boolean findTarget(TreeNode root, int k) {
		traverseTree(root);
		
		for (Integer i : L) {
			
			if ( find(root,  k - i , i ) ) return true; 
			
		}
		
		return false;
		
	    
	}
	
	void traverseTree(TreeNode n) {
		
		if (n == null) return;
		L.add(n.val);
		traverseTree(n.left); 
		traverseTree(n.right);
	}
	
	
	boolean find(TreeNode n, int k , int j) {
        if (n == null)
            return false;
        if (n.val == k && n.val != j)
            return true;

        return find(n.left, k , j) || find(n.right, k , j);
    }

}
