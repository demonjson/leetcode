package code;

public class NO32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int longestValidParentheses(String s) {
		s = ")"+s; //非常关键 （））针对于这种或（）情况
		int length = s.length();
		int dp[] = new int [length];
		int res = 0;
		for(int i = 1; i<length; i++){
			if(s.charAt(i)==')'){
				if(s.charAt(i-1-dp[i-1]) == '(') dp[i] = dp[i-1]+2;
				
				dp[i] = dp[i] + dp[i-dp[i]];
			}
			res = res>dp[i]?res:dp[i];
		}
		return res;
    }
}
