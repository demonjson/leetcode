package code;

public class NO160 {
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
			 val = x;
			 next = null;
		 }
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int length1 = getLength(headA);
		int length2 = getLength(headB);
		if(length1 > length2) {
			for(int i = 1; i<=length1-length2; i++)
				headA = headA.next;
		}else {
			for(int i = 1; i<=length2-length1; i++)
				headB = headB.next;
		}
		
		while(headA!=null && headB!=null) {
			if(headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}
	
	public int getLength(ListNode head) {
		int cnt = 0;
		while(head!=null) {
			cnt++;
			head = head.next;
		}
		return cnt;
	}
}
