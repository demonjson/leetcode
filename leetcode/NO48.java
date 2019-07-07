package code;

public class NO48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//首先以从对角线为轴翻转，然后再以x轴中线上下翻转即可得到结果，如下图所示(其中蓝色数字表示翻转轴)
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for(int i = 0; i < n-1; i++)
			for(int j = 0; j < n-1-i;j++){
				int t = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][n-1-i];
				matrix[n-1-j][n-1-i] = t; 
			}
		
		for(int i = 0; i < n/2; i++)
			for(int j = 0; j < n;j++){
				int t = matrix[i][j];
				matrix[i][j] = matrix[n-1-i][j];
				matrix[n-1-i][j] = t;
			}
	}
}
