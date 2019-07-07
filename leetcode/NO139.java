package code;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NO139 {
	
	 //��̬�滮��
	 //����dp[i]��ʾs.substring(j,i)�Ƿ������wordDict���
	 public boolean wordBreak(String s, List<String> wordDict) {
		 Set<String> wordSet = new HashSet<String>(wordDict);
		 boolean[] dp = new boolean[s.length()+1];
		 dp[0] = true;
		 for(int i = 1; i<=s.length(); i++) {
			 for(int j = i-1; j>=0; j--)
				 if(wordSet.contains(s.substring(j, i)) && dp[j]) {
					 //˵��s.substring(j,i)������wordDict��ɣ�����ѭ��
					 dp[i] = true;
					 break;
				 }
		 }
		 return dp[s.length()];
	 }
}
