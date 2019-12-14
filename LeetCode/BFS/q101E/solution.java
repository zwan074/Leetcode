package q101E;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import q589E.Node;
import q690E.Employee;

public class solution {
	
	
	
	 public int minDepth(TreeNode root) {

		int level = 0;

		Queue <TreeNode> queue = new LinkedList<>();

		queue.add(root);
		queue.add(null);
		
		while(!queue.isEmpty()){
			
			TreeNode temp = queue.poll();
			
			if (temp != null && temp.left == null && temp.right == null) 
				return level;
			
			if(temp == null){
				
				level++;
			    queue.add(null);
			    
			    if(queue.peek() == null) break;
			    else continue;
		    }
			
			
			
			if(temp.left != null) {

				queue.add(temp.left);
				
			}
			
			if(temp.right != null) {

				queue.add(temp.right);
				
			}
			
			    
	    }
		
		
		return level;
		
		
    }
	


}
