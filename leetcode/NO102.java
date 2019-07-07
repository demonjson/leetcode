package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NO102 {

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
	
	public List<List<Integer>> levelOrder(TreeNode root) {
	    List<List<Integer>> res = new ArrayList<List<Integer>>();
	    if(root == null)
	    	return res;
	    List<TreeNode> queue = new ArrayList<TreeNode>();
	    queue.add(root);
	    int count = 1;
	    int nextCount = 0;
	    List<Integer> t = new ArrayList<Integer>();
	    while(queue.size()>0){
	    	TreeNode temp = queue.remove(0);
	    	t.add(temp.val);
	    	if(temp.left !=null ){
	    		queue.add(temp.left);
	    		nextCount++;
	    	}
	    		
	    	if(temp.right != null){
	    		queue.add(temp.right);
	    		nextCount++;
	    	}
	    		
	    	count--;
	    	if(count == 0){
	    		res.add(t);
	    		t = new ArrayList<Integer>();
	    		count = nextCount;
	    		nextCount = 0;
	    	}
	    	
	    }
	    
	    return res;
	}

}
