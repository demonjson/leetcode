package code;

public class NO221 {

	//动态规划法
	//数组dp保存了以当前下标为又下标的最大正方形的边长,最终返回正方形的面积
	//dp[i][j]由dp[i-1][j]、dp[i][j-1]和dp[i-1][j-1]的最小值决定
	public int maximalSquare(char[][] matrix) {
        if(matrix == null ||matrix.length<1 || matrix[0] == null)
        	return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int res = 0;
        int[][] dp = new int [n][m];
        for(int i = 0; i<n; i++) {
        	for(int j = 0; j<m; j++) {
        		if(i == 0 || j == 0)
        			dp[i][j] = matrix[i][j]-'0';
        		else if(matrix[i][j] == '1') {
        			dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1])
        					, dp[i-1][j-1])+1;
        		}
        		if(dp[i][j] > res)
        			res = dp[i][j];
        	}
        }
        return res*res;
    }
	
}
