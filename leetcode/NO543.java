package code;

public class NO543 {
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	int res = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		if(root==null)
			return 0;
		helper(root);
        return res;
    }
	
	public int helper(TreeNode root) {
		if(root.left == null && root.right == null)
			return 0;
		int left = 0, right = 0;
		if(root.left!=null)
			left = helper(root.left) + 1;
		if(root.right!=null)
			right = helper(root.right) + 1;
		res = Math.max(res, left+right);
		
		return Math.max(left, right);
	}
}
