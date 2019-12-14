package q561E;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public int arrayPairSum(int[] nums) {
		
		
        Arrays.sort(nums);
        
        int sum = 0 ;
        
        for (int i = 0 ; i < nums.length; i += 2) 
        	sum += nums[i];
        
        return sum;
        
    }
}
