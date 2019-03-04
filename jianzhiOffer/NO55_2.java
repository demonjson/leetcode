package code;

import code.NO32.TreeNode;

public class NO55_2 {

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean IsBalanced_Solution(TreeNode root) {
		int depth = depth(root);
		if(depth == -1)
			return false;
		return true;
    }

	public int depth(TreeNode root){
		if(root == null)
			return 0;
		int left = depth(root.left);
		if(left == -1)
			return -1;
		int right = depth(root.right);
		if(right == -1)
			return -1;
		if(left-right>1 || left -right<-1)
			return -1;
		else
			return left>right?left+1:right+1;
	}
}
