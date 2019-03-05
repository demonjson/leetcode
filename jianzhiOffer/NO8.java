package code;

public class NO8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null)
            return null;
        TreeLinkNode next = null;
        if(pNode.right!=null){
            TreeLinkNode right = pNode.right;
            while(right.left!=null){
                right = right.left;
            }
            next = right;
        }else if(pNode.next!=null){
            TreeLinkNode cur = pNode;
            TreeLinkNode parent = pNode.next;
            while(parent != null && cur == parent.right){
                cur = parent;
                parent = parent.next;
            }
            next = parent;
        }
        return next;
    }	
	


}
