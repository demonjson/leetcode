package code;

public class NO104 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxDepth(TreeNode root) {
        if(root == null)
        	return 0;
        int max1 = 1 + maxDepth(root.left);
        int max2 = 1 + maxDepth(root.right);
        return Math.max(max1, max2);
    }

}
