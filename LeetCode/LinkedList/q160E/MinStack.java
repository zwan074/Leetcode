package q160E;

import java.util.Arrays;

public class MinStack {

	int[] s;
    /** initialize your data structure here. */
    public MinStack() {
        s = new int[1];
        s[0] = Integer.MAX_VALUE;
    }
    
    public void push(int x) {

		s = Arrays.copyOf(s, s.length+1);
	    s[s.length-1] = x;
    	
       
    }
    
    public void pop() {

		s = Arrays.copyOfRange(s, 0, s.length-1);
	
    }
    
    public int top() {

        return s[s.length-1];
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int e : s)
        	if (e < min) min = e;
    	return min;
    }
    
    @Override
	public String toString() {
		return "MinStack [s=" + Arrays.toString(s) + "]";
	}

	public static void main(String[] args) {
    	
    	MinStack minStack = new MinStack();
    	minStack.push(-2);
    	System.out.println(minStack.s.length);
    	minStack.push(0);
    	System.out.println(minStack.s.length);
    	minStack.push(-3);
    	System.out.println(minStack.s.length);
    	minStack.getMin();   
    	minStack.pop();
    	System.out.println(minStack.s.length);
    	minStack.top();      
    	minStack.getMin();  
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
