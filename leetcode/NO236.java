package code;

public class NO236 {

	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	//https://www.cnblogs.com/grandyang/p/4641968.html
	//第一种情况是两个节点是在公共祖先的左右两侧，
	//第二种情况是都在树的左侧，第三种情况是都在树的右侧，
	//如果是第二，第三种情况的话，公共祖先就在给定的两个点中比较上面的那一个。
	//此函数判断以root为根节点的子树中是否包含p和q节点，返回包含p和q的公共父节点
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null)
			return null;
		if(root == p || root == q)
			return root;
		//p和q分别在root的左右子树，则返回root
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if(left!=null && right!=null)
			return root;
		return left!=null? left: right;
	}
}
