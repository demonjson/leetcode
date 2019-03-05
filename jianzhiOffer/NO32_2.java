package code;

import java.util.ArrayList;
public class NO32_2 {

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
	
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
        if(pRoot == null)
            return result;
        ArrayList<TreeNode> quene = new ArrayList<TreeNode>();
        ArrayList<Integer> t = new ArrayList<Integer>();
        quene.add(pRoot);
        int cur = 1;
        int next = 0;
        while(quene.size()>0){
            TreeNode node = quene.remove(0);
            
            if(node.left!=null){
                next++;
                quene.add(node.left);
            }
            if(node.right!=null){
                next++;
                quene.add(node.right);
            }
            t.add(node.val);
            cur--;
            if(cur==0){
                cur = next;
                next = 0;
                result.add(t);
                t = new ArrayList<Integer>();
            }
            
        }
        return result;
    }

	 
}
