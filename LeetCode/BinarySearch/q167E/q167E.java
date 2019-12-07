package q167E;

public class q167E {
	
public int[] twoSum(int[] numbers, int target) {
		
		int[] index = new int[2];
		
		for (int i = 0 ; i < numbers.length ; i++) {
			
			int another_number = target - numbers[i];
			int another_index = Bsearch (numbers,  another_number , i) ; 
			if (   another_index   != -1 ) {
				index[0] = i + 1;
				index[1] = another_index + 1;   
				break;
			}
				     
			
		}
		
		
		
		
		return index;
	        
    }
	
	int Bsearch (int[] numbers, int target , int init) {
		
		int low = 0, high = numbers.length - 1 , mid = 0;
		
		while (low <= high) {
			mid = (low + high) / 2;
			
			if (numbers[mid] == target && mid != init) 
				return mid; 
			else if (numbers[mid] < target || numbers[mid] == target && mid == init) 
				low = mid+1;
			else 
				high = mid-1;
			
			
		}
		
		
		return -1;
		
	}

}
