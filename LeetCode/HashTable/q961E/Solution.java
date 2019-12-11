package q961E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;

public class Solution {
	public int repeatedNTimes(int[] A) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		int N = 0, key = 0;
		for ( int i : A ) {
			
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}
		
		
		for (Integer h : hm.keySet()) {
			
			
			
			if ( hm.get(h) > N) {
				
				N = hm.get(h);
				key = h;
			}
		}
		
		return key;
		
    }
	 
	

}
