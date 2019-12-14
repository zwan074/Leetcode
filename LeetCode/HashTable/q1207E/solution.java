package q1207E;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class solution {
	
	
	 public boolean uniqueOccurrences(int[] arr) {
        
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for (int i = 0; i < arr.length ; i++) 
			hm.put(arr[i], hm.getOrDefault(i, 0) + 1) ;

		
		Set<Integer> set = new HashSet<>();
		

		return  new HashSet<>(hm.values()).size() == hm.size();
    }
}
