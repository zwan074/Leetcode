package q557E;

import java.util.HashSet;
import java.util.Set;

public class solution {
	
	
	public String reverseWords(String s) {
		
		String r = new String();
		
		int start = 0 , end = 0;
		
		for ( int i = 0 ; i < s.length() ; i++  ) {
			
			StringBuilder sb = new StringBuilder();
			
			if ( s.charAt(i) == ' ') {
				end = i;
				r += sb.append(s.substring(start, end)).reverse() + " ";
				start = i+1;
				
			}
			
			
		}
		
		StringBuilder sb = new StringBuilder();
		r += sb.append(s.substring(start)).reverse();
		return r;
        
    }

}
