package code;

public class NO37 {

	
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
	
	int index = -1;
    String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if(root == null){
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        TreeNode node = null;
        String[] s = str.split(",");
        if(!s[index].equals("#")){
            node = new TreeNode(Integer.valueOf(s[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
	
	
	 

}
