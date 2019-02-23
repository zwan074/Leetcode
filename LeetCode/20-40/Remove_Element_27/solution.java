package Remove_Element_27;

public class solution {
	public int removeDuplicates(int[] nums , int val) {
        
	    if ( nums == null ) return 0;
        int length = 0;
        for ( int i = 0 ; i < nums.length ; i++){
            if ( nums[i] != nums[val] ) { length++; }
            
        }
        return length;
	}
	
	public static void main(String[] args) {
		solution s = new solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4}  ;
        System.out.println(s.removeDuplicates (nums,3)  );

	}

}
