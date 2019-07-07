package code;

public class NO338 {
	
	public int[] countBits(int num) {
		int[] dp = new int[num+1];
		for(int i = 0; i<=num; i++)
			dp[i] = dp[i>>2] + i%2;
		return dp;
	}
}
