package code;

import java.util.Stack;
import java.util.ArrayList;
public class NO32_3 {

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	 public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        ArrayList<Integer> t = new ArrayList<Integer>();
	        if(pRoot == null)
	            return result;
	        Stack<TreeNode> s0 = new  Stack<TreeNode>();
	        Stack<TreeNode> s1 = new  Stack<TreeNode>();
	        int cur = 0;
	        int next = 1;
	        s0.push(pRoot);
	        while(!s0.isEmpty()||!s1.isEmpty()){
	            
	            TreeNode node = null;
	            if(cur == 0){
	                node = s0.pop();
	            }else{
	                node = s1.pop();
	            }
	            t.add(node.val);
	            if(cur == 0){
	                if(node.left != null){
	                    if(next == 0)
	                        s0.push(node.left);
	                    else
	                        s1.push(node.left);
	                }
	                if(node.right != null){
	                    if(next == 0)
	                        s0.push(node.right);
	                    else
	                        s1.push(node.right);
	                }
	            }
	            else{
	                if(node.right != null){
	                    if(next == 0)
	                        s0.push(node.right);
	                    else
	                        s1.push(node.right);
	                }
	                if(node.left != null){
	                    if(next == 0)
	                        s0.push(node.left);
	                    else
	                        s1.push(node.left);
	                }
	            }
	            if(cur == 0 && s0.isEmpty()){
	                result.add(t);
	                t = new ArrayList<Integer>();
	                cur  = 1-cur;
	                next = 1-next;
	            }else if(cur == 1 && s1.isEmpty()){
	                result.add(t);
	                t = new ArrayList<Integer>();
	                cur  = 1-cur;
	                next = 1-next;
	            }
	        }
	        return result;
	    }
	
	
	
}
