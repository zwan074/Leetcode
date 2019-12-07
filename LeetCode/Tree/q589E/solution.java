package q589E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class solution {
	
	public List<Integer> preorder(Node root) {
		
		Stack<Node> stack= new Stack<>();
		List<Integer> L = new ArrayList<>();
		stack.push(root);
		L.add(root.val);
		
		while (stack.size() > 0 ) {
			
			if (stack.peek().children.size() == 0 ) {
				stack.pop();
			}
				
			else {
				
				Node firstChild = stack.peek().children.remove(0);
				L.add(firstChild.val);
				stack.push( firstChild);  
			}
			
			
			
			
			
		}
		
			
		
		
		return L;
        
    }

}
