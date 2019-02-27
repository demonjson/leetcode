package code;

import java.util.Stack;
public class NO31 {

	/**
	 * @param args
	 */
	
/*	Stack<Integer> data = new Stack<Integer>();*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean IsPopOrder(int [] pushA,int [] popA) {
		/*boolean flag = false;
		
		
		int i=0,j=0;
		
		while(pushA[i]!=popA[j]&&i<pushA.length&&i<pushA.length){
			data.push(pushA[i]);
			i++;
		}
		
		if(pushA[i]==popA[j]){
			i++;
			j++;
			while(!data.isEmpty()&&data.peek()==popA[j]&&j<popA.length){
				data.pop();
				j++;
			}
			while(i<pushA.length && j<popA.length && pushA[i]==popA[j]){
				i++;
				j++;
			}
		}
		
		if(i>=pushA.length && data.peek()==popA[j]){
			data.pop();
			j++;
		}
		
		return flag;*/
		if(pushA.length == 0||popA.length==0)
			return false;
		
		Stack<Integer> data = new Stack<Integer>();
		int j = 0;
		for(int i = 0;i<pushA.length;i++){
			data.push(pushA[i]);
			while(!data.isEmpty()&&data.peek()==popA[j]){
				data.pop();
				j++;
			}
		}
		return data.isEmpty();
	}
}
