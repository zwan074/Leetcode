class Solution2 {
   public int lengthOfLongestSubstring(String s) {
		
		int longestSubstring = 0;
		int j = 0;
        int i = 0;
        
        HashMap<Integer,Character> mem = new HashMap<>();
        
		for ( ; i< s.length();i++) {
			
			if ( !mem.containsValue( s.charAt(i) ) ) {

				mem.put (i, s.charAt(i)  );
				
				if (longestSubstring < mem.size() ) {
					
					longestSubstring =  mem.size();
					
				}
				
			}
			
			else {
                
                mem.put (i, s.charAt(i)  );
                
                while ( mem.get (j) != s.charAt(i)  ) {
                    mem.remove(j);
                    j++;
                }
                
                if ( mem.get(j) == mem.get(i)) {
                    mem.remove(j);
                    j++;
                }
               
                
			}
            
            
		}
		
		
		return longestSubstring;
        
        
    }
}
