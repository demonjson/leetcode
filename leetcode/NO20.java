package code;

import java.util.Stack;

public class NO20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NO20().isValid("()");
	}

	public boolean isValid(String s) {
	     Stack<Character> stack = new Stack<Character>(); 
	     for(int i = 0; i<s.length(); i++){
	    	 char c = s.charAt(i);
	    	 if(c=='(' || c=='{' || c=='[')
	    		 stack.push(c);
	    	 if(c==')' || c=='}' || c==']'){
	    		 if(!stack.isEmpty()&&((c==')' && stack.peek()=='(')||(c=='}' && stack.peek()=='{')||(c==']' && stack.peek()=='['))){
	    			 stack.pop();
	    		 }else{
	    			 return false;
	    		 }
	    	 }
	    		 
	     }
	     if(stack.isEmpty())
	    	 return true;
	     else
	    	 return false;
	}
}
