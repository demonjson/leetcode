package code;

public class NO687 {
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	int res = 0;
	
	public int longestUnivaluePath(TreeNode root) {
	     getResult(root);
	     return res; 
	}
	
	public int getResult(TreeNode root) {
		if(root == null)
			return 0;
		int left = getResult(root.left);
		int right = getResult(root.right);
		
		int leftCur = 0;
		int rightCur = 0;
		if(root.left != null && root.val == root.left.val)
			leftCur = left + 1;
		if(root.right != null && root.val == root.right.val)
			rightCur = right + 1;
		
		res = Integer.max(res, leftCur + rightCur);
		return Integer.max(leftCur, rightCur);
	}
}
