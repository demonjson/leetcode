package code;

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) {
	     val = x;
	     next = null;
	 }
}

public class NO141 {
	public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow!=null && fast!=null) {
        	slow = slow.next;
        	fast = fast.next;
        	//��Ҫ�ж�fast�ǲ���Ϊ��
        	if(fast == null)
        		return false;
        	fast = fast.next;
        	if(slow == fast)
        		return true;
        }
        return false;
    }
}
