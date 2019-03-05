package code;

public class NO18_2 {

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
	
	public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null)
            return null;
        ListNode node = pHead;
        ListNode pNode  = null;
        while(node!=null){
           ListNode next = node.next;
            boolean flag = false;
            if(next!=null && next.val == node.val)
                flag = true;
            if(flag == false){
                pNode = node;
                node = node.next;
            }else{
                int value = node.val;
                ListNode del = node;
                while(del!=null && del.val == value){
                    next = del.next;
                    del = null;
                    del = next;
                }
                if(pNode == null){
                    pHead = next;
                }else{
                    pNode.next = next;
                }
               node = next; 
            }
            
        }
        return pHead;
    }	
	   
	

}
