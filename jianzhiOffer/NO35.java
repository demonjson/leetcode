package code;

public class NO35 {

	public class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;

	    RandomListNode(int label) {
	        this.label = label;
	    }
	}
	
	
	public static void main(String[] args) {
		

	}
	
	/*
	 * 
	
		*解题思路：
		*1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
		*2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
		*3、拆分链表，将链表拆分为原链表和复制后的链表
	 * 
	 */
	public RandomListNode Clone(RandomListNode pHead){
        if(pHead == null){
        	return null;
        }
        RandomListNode curr = pHead;
        while(curr!=null){
        	RandomListNode copy = new RandomListNode(curr.label);
        	RandomListNode next = curr.next;
        	copy.next = next;
        	curr.next = copy;
        	curr = next;
        }
        
        curr = pHead;
        while(curr!=null){
        	curr.next.random = (curr.random==null?null:curr.random.next);
        	curr = curr.next.next;
        }
        
        curr = pHead;
        RandomListNode copynew  = pHead.next; 
        while(curr!=null){
        	RandomListNode copy = curr.next;
        	curr.next = copy.next;
        	copy.next = (copy.next==null?null:copy.next.next);
        	curr = curr.next;
        }
        return copynew;
    }

}
