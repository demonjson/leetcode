package code;

public class NO26 {

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public static void main(String[] args) {
		

	}
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean flag = false;
		if(root1!=null && root2!=null){
			if(root1.val == root2.val)
				flag = HasSubtree2(root1, root2);
			//如果当前节点值不相等或者当前值相等但子节点不相等，则从左右子树继续匹配
			if(flag == false){
				flag = HasSubtree2(root1.left, root2) || HasSubtree2(root1.right, root2);
			}
		}
		
		return flag;
    }
	
	public boolean HasSubtree2(TreeNode root1,TreeNode root2){
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.val!=root2.val)
			return false;
		return HasSubtree2(root1.left, root2.left) && HasSubtree2(root1.right, root2.right);
	}

}
