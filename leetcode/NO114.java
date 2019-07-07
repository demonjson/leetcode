package code;

public class NO114 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("s");
	}
	
	public void flatten(TreeNode root) {
		if(root == null)
			return;
		//鍏堟妸宸﹀彸瀛愭爲澶勭悊濂�
		flatten(root.left);
		flatten(root.right);
		
		//鍦ㄦ妸宸﹀瓙鏍戠Щ鍔ㄤ负鏍硅妭鐐圭殑鍙冲瀛愶紝鍙冲瓙鏍戜綔涓哄乏瀛愭爲鐨勫彸瀛╁瓙
		TreeNode right = root.right;
		root.right = root.left;
		root.left = null;
		
		while(root.right!=null) 
			root = root.right;
		root.right = right;
	}

}
