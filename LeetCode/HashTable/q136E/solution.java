package q136E;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class solution {
	
	
	public int singleNumber(int[] nums) {
        
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for (int i = 0; i < nums.length ; i++) 
			hm.put(nums[i], hm.getOrDefault(i, 0) + 1) ;

		
		for (int i = 0; i < nums.length ; i++) 
			if (hm.get(nums[i]) == 1) return nums[i] ;
		
		return 0;
		

    }
}
