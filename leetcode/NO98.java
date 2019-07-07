package code;

import java.util.ArrayList;
import java.util.List;

public class NO98 {

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
	
	//中序遍历法
	List<Integer> list = new ArrayList<Integer>();
	
	
	public boolean isValidBST(TreeNode root) {
		inOrder(root);
		for(int i = 1; i<list.size(); i++)
			if(list.get(i) <= list.get(i-1))
				return false;
		return true;
    }

	public void inOrder(TreeNode root){
		if(root == null)
			return;
		inOrder(root.left);
		list.add(root.val);
		inOrder(root.right);
	}
}
