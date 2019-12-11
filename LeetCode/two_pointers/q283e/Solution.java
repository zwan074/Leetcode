package q283e;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	public void moveZeroes(int[] nums) {
       
        List<Integer> n = new ArrayList<>() ;
        int zeros = 0;
        
        for (int i : nums) {
        	
        	if ( i != 0 ) n.add(i);
        	else zeros++;
        	
        }

        for (int i = 0 ; i < zeros ; i++) n.add(0);
        for (int i = 0 ; i < nums.length ; i++) nums[i] = n.get(i); 
        
        
    }

}
