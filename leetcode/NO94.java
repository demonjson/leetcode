package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NO94 {

	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> result = new ArrayList<Integer>();
		TreeNode p = root;
		while(!stack.isEmpty() || p!=null){
			while(p!=null){
				stack.push(p);
				p = p.left;
			}
			if(!stack.isEmpty()){
				p = stack.pop();
				
				result.add(p.val);
				p = p.right;
			}
		}
		return result;
	}
}
