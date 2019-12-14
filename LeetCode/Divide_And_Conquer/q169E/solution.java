package q169E;

import java.util.Collections;
import java.util.HashMap;

public class solution {
	
	public int majorityElement(int[] nums) {
        
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for (int i : nums) 
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		
		int max = 0 , majority = 0 ;
			
		for (int i : hm.keySet()) {
			
			if (hm.get(i) > max) {
				
				max =   hm.get(i);
				majority = i;
				
			}
			
		}
			
		
		return majority;
		
		
    }

}
