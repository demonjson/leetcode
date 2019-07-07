package code;

public class NO221 {

	//��̬�滮��
	//����dp�������Ե�ǰ�±�Ϊ���±����������εı߳�,���շ��������ε����
	//dp[i][j]��dp[i-1][j]��dp[i][j-1]��dp[i-1][j-1]����Сֵ����
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
