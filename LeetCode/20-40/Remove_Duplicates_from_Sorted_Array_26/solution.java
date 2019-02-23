package Remove_Duplicates_from_Sorted_Array_26;

public class solution {
	public int removeDuplicates(int[] nums) {
		if ( nums == null ) return 0;
        int j = 1, length = 1;
        for ( int i = 0 ; i < nums.length-1 ; i++){
            if ( nums[i] != nums[j] ) { length++; }
            j++;
        }
        return length;
    }
	public static void main(String[] args) {
		solution s = new solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4}  ;
        System.out.println(s.removeDuplicates (nums)  );

	}

}
