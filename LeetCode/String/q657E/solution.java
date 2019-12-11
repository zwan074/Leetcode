package q657E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import q589E.Node;

public class solution {
	
	
	public int uniqueMorseRepresentations(String[] words) {
		
		
		String[] dict = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
				"-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		
				
		Set<String> set = new HashSet<>();
		
		for (String w : words) {
			
			StringBuilder sb = new StringBuilder();
			
			for ( char c : w.toCharArray()) {
				
				sb.append(dict[ c - 'a']);
				
			}
			
			set.add(sb.toString());
			
			
		}
		
		return set.size();
    }

}
