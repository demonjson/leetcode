package code;

public class NO234 {

	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	//������Ҫע����ǣ�������������ȫ��ת����Ϊ��ı�head,ֻ�ܷ�ת��벿
	public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        	return true;
      
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        //�����������ڵ�����
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
