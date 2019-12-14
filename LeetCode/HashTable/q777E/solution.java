package q777E;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class solution {
	
	
	public int numJewelsInStones(String J, String S) {
        
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for (int i = 0; i < S.length() ; i++) {
			
			hm.put(S.charAt(i), hm.getOrDefault(S.charAt(i), 0) + 1) ;
			
			
		}
		
		int js = 0;
		
		for (int i = 0; i < J.length() ; i++) {
			
			if (hm.get(J.charAt(i)) != null)js += hm.get(J.charAt(i));

		}
		
		return js;
    }
}
