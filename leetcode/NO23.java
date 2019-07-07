package code;

public class NO23 {

	
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		
	}
	
	public ListNode mergeKLists(ListNode[] lists) {
			if(lists == null || lists.length<1)
				return null;
	  	
			ListNode head =  new ListNode(-1);
			ListNode p = head;
			int count = 0; //计数已经遍历完的链表;
			int min;
			int index = 0;
		
			
			while(count<lists.length){
				count = 0;
				index = 0;
				min = Integer.MAX_VALUE;
				for(int i = 0;i<lists.length;i++){
					if(lists[i]==null){
						count++;
						continue;
					}
					if(lists[i].val<min){
						min = lists[i].val;
						index = i;
					}
				}
				if(count==lists.length)
					break;
				p.next = lists[index];
				p = p.next;
				lists[index] = lists[index].next;
			}
			return head.next;
    }

}
