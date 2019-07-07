package code;



public class NO148 {
	
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	//归并排序：
	//数组：out-palce 空间复杂度：O(n)
	//链表：in-place 空间复杂度:O(1)
		public ListNode sortList(ListNode head) {
	        if(head == null || head.next == null)
	        	return head;
	        ListNode mid = getMid(head);
	        head = sortList(head);
	        mid = sortList(mid);
	        head = merge(head, mid);
	        return head;
	    }
		
		
		public ListNode getMid(ListNode head) {
			ListNode fast = head;
			ListNode slow = head;
			
			while(fast.next!=null && fast.next.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			
			//一定要断开链表的连接，分成两个子链表
			fast = slow.next;
			slow.next = null;
			return fast;
		}
		
		public ListNode merge(ListNode head1, ListNode head2) {
			ListNode head = new ListNode(-1);
			ListNode p = head;
			
			while(head1!=null && head2!=null){
				if(head1.val<head2.val) {
					p.next = head1;
					p = head1;
					head1 = head1.next;
				}else {
					p.next = head2;
					p = head2;
					head2 = head2.next;
				}
			}
			
			if(head1!=null) {
				p.next = head1;
				p = head1;
				head1 = head1.next;
			}
			if(head2!=null) {
				p.next = head2;
				p = head2;
				head2 = head2.next;
			}
			
			return head.next;
		
		}
		
	
	
}
