package Next_Permutation_31;

import java.util.Arrays;

public class Solution {

	public void nextPermutation(int[] nums) {
        
        if (nums.length == 1 ) return;
        
        int i = nums.length -1 ;
        int[] numsTemp = null;
        
        while ( i > 0 ) {
            
            if ( nums [i-1] < nums[i]  ) {
                
                numsTemp = Arrays.copyOfRange(nums, i , nums.length );
                Arrays.sort(numsTemp);
                int j = 0;
                while ( j < numsTemp.length){
        
                    if ( nums[i-1] < numsTemp [j] ) {
                        
                        int temp; 
                        temp = nums[i-1];
                        nums[i-1] = numsTemp [j];
                        numsTemp [j] = temp;
                        break;
                    }
                    
                    j++;
                    
                    
                }
                
                break;
                    
            }
            
            i--;
        }
        
        
        
        if ( i == 0 && nums [i+1] <= nums[i] ) {
            Arrays.sort(nums);
        }
        else {
             
            for ( int j = 0 ; i < nums.length && j < numsTemp.length ; i++ , j ++){
                nums[i] = numsTemp[j];     
                
            }
            
            
        }
        
        
    }
    
    
    public static void main(String args[])
    {
        int[] test = {1,3,3,5};
        Solution ans = new Solution();
        ans.nextPermutation (test) ;
        
        for ( int i : test ) {
            System.out.print (i);   
        }
        
        
    }

}
