package code;

public class NO25 {

	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public static void main(String[] args) {
		

	}
	
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
		ListNode p1 = list1;
		ListNode p2 = list2;
		ListNode p = null;
		ListNode p3 = null;
		if(p1.val<=p2.val){
			p = p1;
			p1 = p1.next;
		}else{
			p = p2;
			p2 = p2.next;
		}
		p3 = p;
		
		while(p1!=null&&p2!=null){
			if(p1.val<p2.val){
				p3.next = p1;
				p3 = p1;
				p1 = p1.next;
			}else{
				p3.next = p2;
				p3 = p2;
				p2 = p2.next;
			}
		}
		while(p1!=null){
			p3.next = p1;
			p3 = p1;
			p1 = p1.next;
		}
		while(p2!=null){
			p3.next = p2;
			p3 = p2;
			p2 = p2.next;
		}
		
		return p;     
	}

}
