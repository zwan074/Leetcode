package Generate_Parentheses_22;

import java.util.ArrayList;
import java.util.List;

public class solution {
	public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtracking ( ans, "", 0 ,0 , n );
        return ans;
        
    }
	
	
	private void backtracking(List<String> ans, String cur, int left, int right , int max) {
		//System.out.println (ans);
		if ( cur.length() == max * 2 ) {
			ans.add(cur);
			return;
		}
		
		if ( left < max ) {
			System.out.println ("left " + cur );
			backtracking ( ans, cur + "(" , left+1, right , max   );
		}
		
		if ( left > right ) {
			System.out.println ("right " + cur );
			backtracking ( ans, cur + ")" , left, right + 1 , max   );
		}
			
	}


	public static void main(String[] args) {
		solution s = new solution();
		
		System.out.println(s.generateParenthesis(3));
	}

}
