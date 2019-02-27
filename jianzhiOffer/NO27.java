package code;



public class NO27 {

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
	
	public void Mirror(TreeNode root) {
		if(root!=null){
			TreeNode t = null;
			t = root.left;
			root.left = root.right;
			root.right = t;
			Mirror(root.left);
			Mirror(root.right);
		}
		
	}

}
