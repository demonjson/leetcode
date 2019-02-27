package code;

import java.util.ArrayList;

public class NO32 {

	
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

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList <Integer> result = new ArrayList<Integer>();
		ArrayList <TreeNode> quene = new ArrayList<TreeNode>();
		if(root==null)
			return result;
		quene.add(root);
		while(quene.size()>0){
			TreeNode  t = quene.remove(0);
			result.add(t.val);
			if(t.left!=null){
				quene.add(t.left);
			}
			if(t.right!=null){
				quene.add(t.right);
			}
			
		}

		
		return result;
    }
	
}
