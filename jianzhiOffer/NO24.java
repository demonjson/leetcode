package code;

public class NO24 {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public static void main(String[] args) {
		

	}
	
	public ListNode ReverseList(ListNode head) {
	    ListNode pre = null;
	    ListNode node = head;
	    ListNode res = null;
		
	    while(node!=null){
	    	ListNode next = node.next;
	    	if(next == null)
	    		res = node;
	    	node.next = pre;
	    	pre = node;
	    	node = next;
	    }
	    
		return res;
	}

}
