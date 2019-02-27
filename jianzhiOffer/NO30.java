package code;

import java.util.Stack;
public class NO30 {

	Stack <Integer> data = new Stack<Integer>();
	Stack <Integer> min = new Stack<Integer>();
	
	public static void main(String[] args) {
		
	}

	public void push(int node) {
        if(data.size() == 0){
        	data.push(node);
        	min.push(node);
        	return ;
        }
        data.push(node);
        if(node<top()){
        	min.push(node);
        }else{
        	min.push(top());
        }
    }
    
    public void pop() {
        data.pop();
        min.pop();
    }
    
    public int top() {
        return min.peek();
    }
    
    public int min() {
        return min.peek();
    }
}
