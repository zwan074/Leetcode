package q559E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import q589E.Node;

public class solution {
	
	
	public int maxDepth(Node root) {
		
        Stack<Node> stack= new Stack<>();
        int cur_d = 1 , max_d = 0;
        
        if( root == null ) return 0;
        if( root.children.size() == 0 ) return 1;
		if (root != null) stack.push(root);

		while (!stack.isEmpty()) {
			
			if (stack.peek().children.size() == 0 ) {
				stack.pop();
				cur_d--;
			}
				
			else {
				
				Node firstChild = stack.peek().children.remove(0);
				stack.push( firstChild);  
				cur_d++;
				if (max_d < cur_d) max_d = cur_d;
				
			}
			
		}
		
		return max_d;
    }

}
