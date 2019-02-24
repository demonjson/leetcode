package code;

import java.util.ArrayList;
import java.util.Stack;

public class NO6 {

	
	
    public class ListNode {
	     int val;
	     ListNode next = null;
	
	     ListNode(int val) {
	          this.val = val;
	       }
	}
	
	public static void main(String[] args) {
		

	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	    Stack <Integer> stack = new Stack<Integer>();
	    while(listNode!=null){
	    	stack.push(listNode.val);
	    	listNode = listNode.next;
	    }
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    while(!stack.isEmpty()){
	    	list.add(stack.pop());
	    }
		return list;
	}
}
