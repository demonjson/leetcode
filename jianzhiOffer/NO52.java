package code;

import java.util.*;
public class NO52 {

	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public static void main(String[] args) {
		

	}
	
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
         if(pHead1 == null || pHead2 == null)
        	 return null;
        
         Stack<ListNode> s1 = new Stack<ListNode>();
         Stack<ListNode> s2 = new Stack<ListNode>();
         
         ListNode p1 = pHead1;
         ListNode p2 = pHead2;
         
         while(p1!=null){
        	 s1.push(p1);
        	 p1 = p1.next;
         }
         while(p2!=null){
        	 s2.push(p2);
        	 p2 = p2.next;
         }
         
         ListNode c = null;
         while(!s1.isEmpty()&&!s2.isEmpty()){
        	 ListNode c1 = s1.pop();
        	 ListNode c2 = s2.pop();
        	 if(c1!=c2){
        		 return c;
        	 }
        	 c = c1;
         }
         //两个链表第一个就重复的情况
         return c;
	}

}
