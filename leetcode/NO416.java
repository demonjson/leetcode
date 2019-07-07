package code;

import java.util.Arrays;

public class NO416 {
	
	//dfs超时
//	public boolean canPartition(int[] nums) {
//		if(nums == null || nums.length < 1)
//			return false;
//		int sum = 0;
//		for(int num : nums)
//			sum += num;
//		if(sum % 2 == 1)
//			return false;
//		Arrays.sort(nums);
//		return dfs(nums, nums.length - 1, sum/2);
//    }
//	
//	public boolean dfs(int[] nums, int index, int sum) {
//		if(sum < 0)
//			return false;
//		if(sum == 0)
//			return true;
//		for(int i = index; i>=0; i--) {
//			if(dfs(nums, i-1, sum - nums[i]))
//				return true;
//		}
//		return false;
//	}
	
	//dp法
	public boolean canPartition(int[] nums) {
		if(nums == null || nums.length < 1)
			return false;
		int sum = 0;
		for(int num : nums)
			sum += num;
		if(sum % 2 == 1)
			return false;
		sum/=2;
		boolean[] dp = new boolean[sum+1];
		dp[0] = true;
		for(int num:  nums) {
			//循环一定要从target遍历到nums[i]，而不能反过来，想想为什么呢？
			//因为如果我们从nums[i]遍历到target的话，假如nums[i]=1的话，那么[1, target]中所有的dp值都是true，
			//因为dp[0]是true，dp[1]会或上dp[0]，为true，dp[2]会或上dp[1]，为true
			for(int i = sum; i>=num; i--)
				dp[i] = dp[i] || dp[i-num];
		}
		return dp[sum];
	}
}
