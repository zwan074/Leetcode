package q1089E;

public class Solution {
    public void duplicateZeros(int[] arr) {
    	
    	int numberOfZeros = 0;
    	int[] arr2 = new int[arr.length]; 
    	
    	for (int i = 0 ; i < arr.length ; i ++) {
    		if (i+numberOfZeros >= arr.length) break;
    		
    		arr2[i+numberOfZeros] = arr[i];
    		if (arr[i] == 0 ) {
    			numberOfZeros++;
    			if (i+numberOfZeros >= arr.length - 1) break;
    			else arr2[i+numberOfZeros+1] = 0  ;
    		}
    		
    	}
    	
    	for (int i = 0 ; i < arr.length ; i ++) {
    		System.out.print(arr2[i]);
    		arr[i] = arr2[i];
    	}
    	
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution() ;
    	int[] a = {1,5,2,0,6,8,0,6,0};
    	s.duplicateZeros(a);
    	
    }
}
