package code;

public class NO240 {
	
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length < 1)
			return false;
		int n = matrix.length;
		int m = matrix[0].length;
		
		int i = 0, j = m-1;
		while(i<n && j >= 0) {
			if(matrix[i][j] == target)
				return true;
			else if(matrix[i][j] > target)
				j--;
			else
				i++;
		}
		return false;
    }
}
