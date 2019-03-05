package code;

public class NO23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode node = getNode(pHead);
        if(node == null)
            return null;
        ListNode p = node;
        //计算环中的节点个数
        int count = 1;
        while(p.next != node){
            count++;
            p = p.next;
        }
        
        ListNode p1 = pHead;
        ListNode p2 = pHead;
        while(count>0){
            p1 = p1.next;
            count--;
        }
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    
	//找到快慢指针找到环中的一个节点
    public ListNode getNode(ListNode pHead){
        if(pHead == null)
            return null;
        ListNode slow = pHead.next;
        if(slow == null)
            return null;
        ListNode fast = slow.next;
        while(slow!=null && fast!=null){
            if(slow == fast)
                return fast;
            slow = slow.next;
            fast = fast.next;
            if(fast != null)
                fast = fast.next;
        }
        return null;
    }
}
