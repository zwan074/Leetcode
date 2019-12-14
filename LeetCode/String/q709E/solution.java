package q709E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import q589E.Node;

public class solution {
	
	public String toLowerCase(String str) {
		String s = "";
		for (char c : str.toCharArray()) {
			
			if ( c >= 'A' && c <= 'Z' ) 
				s +=  (char) (c - 'A' + 'a');
			else
				s += c;
			
		}
		return s;
    }
	

}
