package code;

public class NO206 {
	
	class ListNode {
	    int val;
	    ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode reverseList(ListNode head) {
        if(head == null)
        	return head;
        
        ListNode pre = null;
        ListNode first = head;
        while(first!=null) {
        	ListNode second = first.next;
        	first.next = pre;
        	pre = first;
        	first = second;	
        }
        return pre; 
    }
}
