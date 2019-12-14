package q111E;

import java.util.ArrayList;
import java.util.Collections;
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
	
	
	
	 public boolean isSymmetric(TreeNode root) {

		int level = 0;

		Queue <TreeNode> queue = new LinkedList<>();
		List<Integer> L = new ArrayList<>();
		
		queue.add(root);
		queue.add(null);
		
		while(!queue.isEmpty()){
			
			TreeNode temp = queue.poll();
			
			
			if(temp == null){

				if (L.size() % 2 != 0  )  return false;
				
				List<Integer> J = new ArrayList<>(L);
				Collections.reverse(L);
				System.out.println(J);
				if (L.size() % 2 == 0 && !J.equals(L)) {
		
					return false;
				}
					
				
				L = new ArrayList<>();
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
			
			if( temp.left != null && temp.right != null) {
				L.add(temp.left.val);
				L.add(temp.right.val);
			}
			if( temp.left == null && temp.right != null) {
				L.add(null);
				L.add(temp.right.val);
			}
			if( temp.left != null && temp.right == null) {
				L.add(temp.left.val);
				L.add(null);
			}
			if( temp.left == null && temp.right == null) {
				L.add(null);
				L.add(null);
			}
			
			
			    
	    }
		
		
		return true;
		
		
    }
	


}
