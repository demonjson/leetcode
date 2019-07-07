package code;

public class NO538 {
	
	 public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	 }
	int sum = 0;
	public TreeNode convertBST(TreeNode root) {
		 helper(root);
		 return root;
    }
	
	//将中序遍历的左根右变为右根左
	public void helper(TreeNode root) {
		if(root == null)
			return;
		helper(root.right);
		root.val+=sum;
		sum=root.val;
		helper(root.left);
	}
}
