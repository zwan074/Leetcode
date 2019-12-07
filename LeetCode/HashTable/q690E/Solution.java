package q690E;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;

public class Solution {
	
	HashMap<Integer, Employee> hm = new HashMap<>();
	int total_importance = 0;
	
	public int getImportance(List<Employee> employees, int id) {
		
		
		for (Employee e : employees) {
			
			hm.put(e.id, e);
			
		}
		
		findSub ( hm.get(id) );
		
		return total_importance;
        
    }
    
	void findSub ( Employee e ) {
		
		total_importance += e.importance;
		
		if ( e.subordinates.size() > 0  ) {
			
			for (Integer i : e.subordinates) {
				
				findSub ( hm.get(i) );
				
			}
			
		}
		
		
		
		
	}
		
	 
	public static void main(String[] args) {
		Solution s = new Solution();


	}

}
