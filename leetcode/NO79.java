package code;

public class NO79 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean exist(char[][] board, String word) {
		int m = board.length;
		int n = board[0].length;
		boolean[] flag = new boolean[m*n];
		for(int i = 0; i<m*n; i++)
			flag[i] = false;
		for(int i = 0; i<m; i++)
			for(int j = 0; j<n; j++){
				if(isExists(board, word, 0, flag, i, j, m, n)){
					return true;
				}
			}
		return false;
	}
	
	public boolean isExists(char[][] board, String word, int index, boolean[] flag,
			int i, int j, int m, int n){
		if(index == word.length())
			return true;
		boolean t = false;
		if(i>=0 && i<m && j>=0 && j<n && flag[i*n+j] == false && board[i][j] == word.charAt(index)){
			index++;
			flag[i*n+j] = true;
			t = isExists(board, word, index, flag, i-1, j, m, n) ||
				isExists(board, word, index, flag, i+1, j, m, n) ||
				isExists(board, word, index, flag, i, j-1, m, n) ||
				isExists(board, word, index, flag, i, j+1, m, n);
			if(t == false){
				index--;
				flag[i*n+j] = false;
			}
		}
		return t;
	}
}
