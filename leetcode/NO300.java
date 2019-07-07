package code;

public class NO300 {
	
	//动态规划法
	public int lengthOfLIS(int[] nums) {
		if(nums == null || nums.length < 1)
			return 0;
		int[] dp = new int[nums.length];
		int res = 1;
		for(int i = 0; i < nums.length; i++) {
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(nums[i] > nums[j]) {
					dp[i] = Math.max(dp[j]+1, dp[i]);
				}
			}
			if(dp[i] > res)
				res = dp[i];
		}
		return res;
	}
}
