package code;

public class NO337 {
	
	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	public int rob(TreeNode root) {
		if(root == null)
			return 0;
		int val1 = root.val;
		//分两种情况，第一种，考虑根节点及其孙子节点
		//第二章，从儿子节点开始考虑
		if(root.left!=null)
			val1 += rob(root.left.left)+rob(root.left.right);
		if(root.right!=null)
			val1 += rob(root.right.left)+rob(root.right.right);
		
		int val2 = rob(root.left)+rob(root.right);
		
		return val1 > val2? val1 : val2;
	}
}
