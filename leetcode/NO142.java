package code;




public class NO142 {
	 public ListNode detectCycle(ListNode head) {
	     ListNode node = CycleOne(head);
	     int cnt = 1;
	     if(node == null)
	    	 return null;
	     else {
	    	 ListNode p = node.next;
	    	 while(p!=node) {
	    		 cnt++;
	    		 p = p.next;
	    	 }
	    	 
	    	 p = head;
	    	 node = head;
	    	 while(cnt--!=0) {
	    		 node = node.next;
	    	 }
	    	 while(p!=node) {
	    		 p = p.next;
	    		 node = node.next;
	    	 }
	    	 return node;
	     }
	 }
	 
	 //找到环中的一个结点
	 public ListNode CycleOne(ListNode head) {
		 ListNode fast = head;
		 ListNode slow = head;
		 while(fast != null && fast.next != null) {
			 slow = slow.next;
			 fast = fast.next.next;
			 if(slow == fast)
				 return slow;
		 }
		 return null;
	 }
}
