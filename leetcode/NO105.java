package code;

public class NO105 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return getTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
	
	public TreeNode getTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
		if(preStart>preEnd || inStart>inEnd)
			return null;
		int index = 0;
		for(int i = inStart; i<=inEnd; i++){
			if(inorder[i] == preorder[preStart]){
				index = i;
				break;
			}			
		}
		
		TreeNode t = new TreeNode(preorder[preStart]);
		t.left = getTree(preorder, preStart+1, preStart+(index-inStart), inorder, inStart, index-1);
		t.right = getTree(preorder, preStart+(index-inStart)+1, preEnd, inorder, index+1, inEnd);
		return t;
	}
}
