package code;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NO139 {
	
	 //动态规划法
	 //数组dp[i]表示s.substring(j,i)是否可以由wordDict组成
	 public boolean wordBreak(String s, List<String> wordDict) {
		 Set<String> wordSet = new HashSet<String>(wordDict);
		 boolean[] dp = new boolean[s.length()+1];
		 dp[0] = true;
		 for(int i = 1; i<=s.length(); i++) {
			 for(int j = i-1; j>=0; j--)
				 if(wordSet.contains(s.substring(j, i)) && dp[j]) {
					 //说明s.substring(j,i)可以由wordDict组成，跳出循环
					 dp[i] = true;
					 break;
				 }
		 }
		 return dp[s.length()];
	 }
}
