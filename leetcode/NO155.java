package code;

import java.util.Stack;

public class NO155 {
	
	class MinStack {

		Stack<Integer> stack;
		Stack<Integer> minStack;
		
	    /** initialize your data structure here. */
	    public MinStack() {
	    	stack = new Stack<Integer>();
	    	minStack = new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	        stack.push(x);
	        if(minStack.isEmpty() || (!minStack.isEmpty() && minStack.peek()>x)) {
	        	minStack.push(x);
	        }else {
	        	minStack.push(minStack.peek());
	        }
	    }
	    
	    public void pop() {
	        stack.pop();
	        minStack.pop();
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int getMin() {
	        return minStack.peek();
	    }
	}

}
