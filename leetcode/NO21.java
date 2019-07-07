package code;

public class NO21 {

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

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null)
			return l2;
		else if(l2 == null)
			return l1;
		ListNode l = null;
		ListNode p = null;
		if(l1.val<=l2.val){
			l = l1;
			l1 = l1.next;
		}
		else{
			l = l2;
			l2 = l2.next;
		}
		
		p = l;
		
		while(l1!=null && l2!=null){
			if(l1.val<=l2.val){
				p.next = l1;
				p = l1;
				l1 = l1.next;
			}else{
				p.next = l2;
				p = l2;
			    l2 = l2.next;
			}
		}
		while(l1!=null){
			p.next = l1;
			p = l1;
			l1 = l1.next;
		}
		while(l2!=null){
			p.next = l2;
			p = l2;
			l2 = l2.next;
		}
		return l;
    }
}
