package code;

public class NO322 {
	
	//动态规划法
	//
	public int coinChange(int[] coins, int amount) {
		if(coins == null || coins.length < 1 || amount == 0)
			return 0;
		int[] dp = new int [amount+1];
		
		for(int coin: coins) {
			//
			for(int i = coin; i<=amount; i++) {
				//找到相等的，一个硬币就能得到结果
				if(i == coin)
					dp[i] = 1;
				//i-coin可以由硬币组合
				//所以dp[i]等于dp[i-coin]+1，就是加上coin硬币
				else if(dp[i] == 0 && dp[i-coin]!=0)
					dp[i] = dp[i-coin] + 1;
				//i-coin和i都可以又硬币组合
				//需要比较两种方式的大小值
				else if(dp[i-coin]!=0)
					dp[i] = Integer.min(dp[i-coin]+1, dp[i]);
			}
		}
		if(dp[amount] == 0)
			return -1;
		else
			return dp[amount];
		
	}
}
