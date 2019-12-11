package q783e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class solution {
	
	List<Integer> L = new ArrayList<>();
	int minD = Integer.MAX_VALUE;
	
	public int minDiffInBST(TreeNode root) {
		
		
		tranverseTree (root );
		Collections.sort(L);
		
		//L.sort((w1, w2) -> w1 == w2 ? w1.compareTo(w2) : w2-w1);
		
		for ( int i = 0 ; i < L.size()-1 ; i++) {
			
			minD = Math.min(minD , L.get(i) - L.get(i-1)  );
			
		}
		
		return minD;
        
    }
	
	void tranverseTree (TreeNode n ) {
		
		if (n == null ) return;
		L.add(n.val);
		
		tranverseTree ( n.left );
		tranverseTree ( n.right );
		
	}
	
	
}
