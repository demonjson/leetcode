package code;


public class NO62 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int uniquePaths(int m, int n) {
		int [][]a = new int[m+1][n+1];
		for(int i = 1; i<=n; i++)
			a[1][i] = 1;
		for(int i = 1; i<=m; i++)
			a[i][1] = 1;
		for(int i = 2; i<=m ;i++)
			for(int j = 2; j<=n; j++)
				a[i][j] = a[i-1][j] + a[i][j-1];
		return a[m][n];
	}

}
