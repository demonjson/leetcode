package code;

public class NO28 {

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean isSymmetrical(TreeNode pRoot){
	    return fun(pRoot,pRoot);
	}
	    
	boolean fun(TreeNode pRoot1,TreeNode pRoot2){
	    if(pRoot1== null && pRoot2 == null)
	        return true;
	    if((pRoot1== null || pRoot2 == null)||pRoot1.val!=pRoot2.val)
	        return false;
	    return fun(pRoot1.left,pRoot2.right) && fun(pRoot1.right,pRoot2.left);
	}
	
}
