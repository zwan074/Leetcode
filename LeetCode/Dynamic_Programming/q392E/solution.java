package q392E;

public class solution {
	
	public boolean isSubsequence(String s, String t) {
        
		int j = 0;
		
		for (char c : t.toCharArray()) {
			
			if ( c == s.charAt(j) ) j++;
			if ( j == s.length()) break;
			
		}
		
		return j == s.length() ;
    }

}
