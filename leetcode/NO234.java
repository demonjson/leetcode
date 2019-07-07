package code;

public class NO234 {

	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	//这题需要注意的是：不能整个链表全翻转，因为会改变head,只能翻转后半部
	public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        	return true;
      
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        //对于奇数个节点的情况
        if(fast!=null)
        	slow = slow.next;
        ListNode reverseList = reverse(slow);
        while(reverseList!=null) {
        	if(head.val!=reverseList.val)
        		return false;
        	head = head.next;
        	reverseList = reverseList.next;
        }
        return true;
    }
	
	public ListNode reverse(ListNode head) {
		ListNode first = head;
		ListNode pre = null;
		while(first!=null) {
			ListNode second = first.next;
			first.next = pre;
			pre = first;
			first = second;
		}
		return pre;
	}
}
