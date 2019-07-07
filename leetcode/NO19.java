package code;

public class NO19 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	//快吗指针，快指针先走n步
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null || head.next == null)
			return null;
		ListNode fast = head;
		ListNode slow = head;
		
		for(int i = 0;i<n;i++){
			fast = fast.next;
			//当n大于长度或等于长度时，直接返回头结点的下个指针
			if(fast == null)
				return head.next;
		}
		
		while(fast.next!=null){
			fast = fast.next;
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		return head;
    }
}


