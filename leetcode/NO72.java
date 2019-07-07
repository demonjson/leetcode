package code;

public class NO72 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public int minDistance(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();
		
		//count[i][j]记录word1的前i个字符转换成word2的前j个字符需要的最小操作次数
		int[][] count = new int[m+1][n+1];
		for(int i = 0; i <= n; i++)
			count[0][i] = i;
		for(int i = 0; i <= m; i++)
			count[i][0] = i;
		
		for(int i = 1; i<=m; i++){
			for(int j = 1; j<=n; j++){
				//word1第i(下标i-1)个字符与word2第j(下标j-1)个字符相等
				if(word1.charAt(i-1) == word2.charAt(j-1))
					count[i][j] = count[i-1][j-1];
				//不相等时，有三种操作：增删改
				else{
					int addCount = count[i][j-1]+1;
					int deleteCount = count[i-1][j]+1;
					int updateCount = count[i-1][j-1]+1;
					count[i][j] = Math.min(Math.min(addCount, deleteCount), updateCount);
				}
			}
		}
		return count[m][n];
		
	}
}
