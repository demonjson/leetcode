package code;

public class NO494 {
	
	int res = 0;
	public int findTargetSumWays(int[] nums, int S) {
		getRes(nums, S, 0);
		return res;
    }
	
	public void getRes(int[] nums, int S, int index) {
		if(index == nums.length && S == 0) {
			res++;
		}
		if(index == nums.length)
			return;
		getRes(nums, S-nums[index], index+1);
		getRes(nums, S+nums[index], index+1);
	}
}
