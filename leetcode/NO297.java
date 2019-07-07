package code;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NO297 {

	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
        	return "#";
        return root.val + "," + serialize(root.left)+","+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return fun(queue);
    }
    
    public TreeNode fun(Queue<String> queue) {
    	String s = queue.poll();
    	if(s.equals("#"))
    		return null;
    	TreeNode root = new TreeNode(Integer.parseInt(s));
    	root.left = fun(queue);
    	root.right = fun(queue);
    	return root;
    }
}
