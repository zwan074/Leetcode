package q706E;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import Generate_Parentheses_22.solution;
import q589E.Node;

public class MyHashMap {

	List<item> L = new ArrayList<>();
	
    /** Initialize your data structure here. */
    public MyHashMap() {
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
    	for (item i : L) { 
    		if (i.key == key) {
    			i.value = value;
    			return;
    		}
    	}
        L.add( new item (key,value));
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
    	for (item i : L) {
    		if ( i.key == key  ) return i.value;
    	}
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
    	for (item i : L) {
    		
    		if ( i.key == key  ) {
    			L.remove(i);
    			return;
    		}
    		
    	}
    }
    
    class item {
    	
    	int key, value;
    	public item(int key, int value) {
            this.key = key;
            this.value = value;
        }
    	
    }
    
    public static void main(String[] args) {
		
		MyHashMap hashMap = new MyHashMap();
		hashMap.put(1, 1);          
		hashMap.put(2, 2); 
		
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.get(3));
		
		hashMap.put(2, 1); 
		System.out.println(hashMap.get(2));
		hashMap.remove(2);
		System.out.println(hashMap.get(2));
	}
    
}




/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
