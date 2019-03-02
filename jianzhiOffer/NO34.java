package code;

import java.util.ArrayList;

public class NO34 {

	
	
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
		if(root==null)
			return listAll;
		findPath(listAll, new ArrayList<Integer>() , root, target);
		return listAll;
    }

	public void findPath(ArrayList<ArrayList<Integer>> listAll,ArrayList<Integer>path, 
			TreeNode root,int target){
		path.add(root.val);
		if(root.left == null && root.right == null && root.val == target){
			listAll.add(path);
		}
		
		ArrayList<Integer> path2 = new ArrayList<Integer>();
		path2.addAll(path);
		if(root.left!=null) 
			findPath(listAll, path,root.left,target-root.val);
		if(root.right!=null)	
			findPath(listAll, path2,root.right,target-root.val);
	}
}
