package code;

public class NO236 {

	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	//https://www.cnblogs.com/grandyang/p/4641968.html
	//��һ������������ڵ����ڹ������ȵ��������࣬
	//�ڶ�������Ƕ���������࣬����������Ƕ��������Ҳ࣬
	//����ǵڶ�������������Ļ����������Ⱦ��ڸ������������бȽ��������һ����
	//�˺����ж���rootΪ���ڵ���������Ƿ����p��q�ڵ㣬���ذ���p��q�Ĺ������ڵ�
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null)
			return null;
		if(root == p || root == q)
			return root;
		//p��q�ֱ���root�������������򷵻�root
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if(left!=null && right!=null)
			return root;
		return left!=null? left: right;
	}
}
