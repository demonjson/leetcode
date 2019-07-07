package code;

public class NO55 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean canJump(int[] nums) {
		int last = nums.length - 1;
		for(int i = nums.length - 2; i>=0; i--){
			if(nums[i] + i >= last)
				last = i;
			//从后往前
			//这里不能break,因为当前节点不能到达，有可能此节点的前面节点可以到达，需要继续尝试
		}
		if(last == 0)
			return true;
		return false;
		
	}
}
