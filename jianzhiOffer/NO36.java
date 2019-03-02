package code;

public class NO36 {

	private TreeNode head;
	private TreeNode realhead;
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public static void main(String[] args) {
		

	}

	
	public TreeNode Convert(TreeNode pRootOfTree) {
		ConvertFun(pRootOfTree);
		return realhead;
	}
	
	public void ConvertFun(TreeNode pRootOfTree){
		if(pRootOfTree == null)
			return;
		ConvertFun(pRootOfTree.left);
		
		//子递归第一次执行时，就是readhead保存中序遍历的第一个节点
		//head保存当前中序遍历的前一个节点
		if(head == null){
			head = pRootOfTree;
			realhead = pRootOfTree;
		}else{
			head.right = pRootOfTree;
			pRootOfTree.left = head;
			head = pRootOfTree;
		}
		ConvertFun(pRootOfTree.right);
	}
}
