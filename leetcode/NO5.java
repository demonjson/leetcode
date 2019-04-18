package code;

public class NO5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//动态规划法
	public String longestPalindrome(String s) {
	    int length = s.length();
	    //dp[i][j]保存i到j是否是回文的
		boolean [][]dp = new boolean [length][length];
	    int max = 0;
	    String res = "";
		for(int j = 0;j<length;j++){
			for(int i = 0;i<=j;i++){
				//相邻或者是同一位
				if(s.charAt(i) == s.charAt(j) && j - i < 2)
					dp[i][j] = true;
				//相邻至少2位，要根据之前的结果判断
				if(s.charAt(i) == s.charAt(j) && j - i >= 2 && dp[i+1][j-1])
					dp[i][j] = true;
				if(dp[i][j] && j-i+1>max){
					max = j-i+1;
					res = s.substring(i, j+1);
				}
			}
		}
	
		return res;
	}

}
