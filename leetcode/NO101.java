package code;

public class NO101 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public boolean isSymmetric(TreeNode root) {
		return isSymmetricFun(root,root);
    }

	public boolean isSymmetricFun(TreeNode left, TreeNode right){
		if(left == null && right == null)
			return true;
		if(left == null || right == null)
			return false;
		if(left.val != right.val)
			return false;
		return isSymmetricFun(left.left, right.right) && isSymmetricFun(left.right, right.left);
	}
}
