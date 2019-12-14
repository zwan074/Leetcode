package q104E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solution {
	
	
	public int maxDepth(TreeNode root) {
		
		return md( root,  0) ;
    }
	
	int md(TreeNode root, int d) {
		
		if(root == null) return d;
        System.out.println(root.val + " " + d);
        return Math.max(md(root.left , d++),md(root.right, d++));
	}
	

}
