package q226E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class solution {
	
	
	public TreeNode invertTree(TreeNode root) {
        
        if (root == null) return root;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
        
    }
	

}
