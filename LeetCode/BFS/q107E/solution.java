package q107E;

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
	
	
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		
		if (root == null)  {
			List<List<Integer>> L = new ArrayList<>();
			return L;
		}

		int level = 0;
		List<List<Integer>> ans = new ArrayList<>();
		
		Queue <TreeNode> queue = new LinkedList<>();
		List <List<Integer>> tempQ = new LinkedList<>();
		
		queue.add(root);
		queue.add(null);
		List <Integer> tempList = new LinkedList<>();
		
		tempList.add(root.val);
		tempQ.add(tempList);
		
		while(!queue.isEmpty()){
			
			TreeNode temp = queue.poll();

			if(temp == null){
				
				level++;
			    queue.add(null);
			    tempList = new LinkedList<>();
			    for ( TreeNode e : queue ) {
			    	if(e!=null) tempList.add(e.val);
			    	
			    }
			    tempQ.add(tempList);
			    
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
		
		System.out.println(tempQ);
		
		for ( int i = tempQ.size() -2 ; i >= 0 ; i--) {
			ans.add(tempQ.get(i));
		}
		
		return ans;
		
		
    }
	


}
