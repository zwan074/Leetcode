package q692M;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;

public class Solution {
	public List<String> topKFrequent(String[] words, int k) {
		
		HashMap<String, Integer> ht = new HashMap<>();
		
		for (String w : words) {
			
			ht.put(w, ht.getOrDefault(w, 0) + 1);
			
		}
		
		List<String> candidates = new ArrayList(ht.keySet());
        Collections.sort(candidates, (w1, w2) -> ht.get(w1).equals(ht.get(w2)) ?
                w1.compareTo(w2) : ht.get(w2) - ht.get(w1));
        
		
		System.out.print(candidates);
		
		return candidates.subList(0,k);
    
		
		
    }
	 
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
		s.topKFrequent(words, 2);

	}

}
