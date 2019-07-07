package code;

public class NO124 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int max = Integer.MIN_VALUE;
	
	public int maxPathSum(TreeNode root) {
		getMax(root);
	    return max;
	}

	//max 记录最后的结果
	//left  记录当前左子树的最长线路 和之值加上当前父节点的和
	//right 记录当前右子树的最长线路 和之值加上当前父节点的和
	public int getMax(TreeNode root){
		if(root == null) 
			return 0;
		int left = Math.max(getMax(root.left),0);
		int right = Math.max(getMax(root.right),0);
		max = Math.max(max, left+right+root.val);
		return Math.max(left, right)+root.val;
	}
}
