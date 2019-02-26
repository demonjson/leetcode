package code;

public class NO22 {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	    
	public static void main(String[] args) {
		
		

	}
	
	 public ListNode FindKthToTail(ListNode head,int k){
		 //头结点为空或者k=0的情况
		 if(head == null || k <=0)
			 return null;
		 ListNode pre = head;
		 ListNode next = head;
		 for(int i = 0;i< k-1;i++){
			 pre = pre.next;
			 //k大于链表长度的情况
			 if(pre == null)
				 return null;
		 }
		
		 while(pre.next!=null){
			 pre=pre.next;
			 next = next.next;
		 }
		 
		 return next;
	 }

}
