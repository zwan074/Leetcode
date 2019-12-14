package q728E;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import q589E.Node;
import q690E.Employee;

public class solution {
	
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> L = new ArrayList<>();
		
		for ( int i = left ; i <= right ; i++) {
			
			
			String number = String.valueOf(i);
	
			boolean add = true;
			for (char c : number.toCharArray()) {
				
				if ( c == '0' || i % Integer.parseInt(c+"") != 0 ) {
					add = false;
					break; 
				}
				
			}
			
			if (add) L.add(i);
				
			
		}
		
		
		return L;
    }
	


}
