package q622M;

import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {
	List<Integer> q;
	int size;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.q = new ArrayList<Integer>(k)  ;
        this.size = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
    	
    	
    	if (q.size() == this.size) return false;
    	q.add(value);
        return true;
        
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
    	
    	if (q.size() == 0 ) return false;
    	q.remove(0);
    	return true;
    	
    }
    
    /** Get the front item from the queue. */
    public int Front() {
    	
    	if (q.size() == 0 ) return -1;
    
    	return q.get(0);
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
    	
    	if (q.size() == 0 ) return -1;
    	return q.get(q.size()-1);
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return q.size() == 0 ? true : false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
    	return q.size() == this.size ? true : false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
