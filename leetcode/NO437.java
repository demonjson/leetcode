package code;

public class NO437 {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	int res = 0;
	
	public int pathSum(TreeNode root, int sum) {
        if(root == null)
        	return res;
        fun(root,sum);
        if(root.left!=null)
        	pathSum(root.left, sum);
        if(root.right!=null)
        	pathSum(root.right, sum);
        return res;
    }
	
	public void fun(TreeNode root, int sum) {
		if(root == null)
			return;
		if(root.val > sum)
			return;
		if(root.val == sum)
			res++;
		if(root.left!=null)
			fun(root.left, sum-root.val);
		if(root.right!=null)
			fun(root.right, sum-root.val);
	}
}
