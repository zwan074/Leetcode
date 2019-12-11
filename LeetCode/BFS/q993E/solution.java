package q993E;

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
	
	
	
	public boolean isCousins(TreeNode root, int x, int y) {

		int level = 0;

		HashMap<Integer, Integer> hm =  new HashMap<>();
		Queue <TreeNode> queue = new LinkedList<>();

		queue.add(root);
		queue.add(null);
		
		while(!queue.isEmpty()){
			
			TreeNode temp = queue.poll();

			if(temp == null){
				System.out.println(hm.entrySet());
				if ( hm.get(x) != null && hm.get(y) !=null && hm.get(x) != hm.get(y) )
					return true;
				
				hm = new HashMap<>();
				System.out.println("---new hashmap---");
				level++;
			    queue.add(null);
			    
			    if(queue.peek() == null) break;// You are encountering two consecutive `nulls` means, you visited all the nodes.
			    else continue;
		    }
			
			
			
			if(temp.left != null) {

				queue.add(temp.left);
				hm.put(temp.left.val, temp.val);
			}
			
			if(temp.right != null) {

				queue.add(temp.right);
				hm.put(temp.right.val, temp.val);
			}
			
			    
	    }
		
		
		return false;
		
		
    }
	


}
