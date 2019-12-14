package q617E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solution {
	
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;
		
		t1.val = t1.val + t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
		
    }
	
	

}
