package q590E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class solution {
	
	public List<Integer> postorder(Node root) {
        Stack<Node> stack= new Stack<>();
		List<Integer> L = new ArrayList<>();
		if (root != null)stack.push(root);

		while (!stack.isEmpty()) {
			
			if ( stack.peek().children.size() > 0   ) {
				stack.push( stack.peek().children.get(0));  
			}
			else {
				
				L.add(stack.pop().val);
				if (!stack.isEmpty()) stack.peek().children.remove(0);
			}
			
		}
		
		return L;
    }

}
