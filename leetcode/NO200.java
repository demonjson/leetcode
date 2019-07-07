package code;

public class NO200 {
	
	 public int numIslands(char[][] grid) {
		 if(grid == null || grid.length < 1 || grid[0] == null)
			 return 0;
		 int n = grid.length;
		 int m = grid[0].length;
		 int cnt = 0;
		 boolean[][] isVisited = new boolean[n][m];
		 for(int i = 0; i < n; i++)
			 for(int j = 0; j < m; j++) {
				 if(!isVisited[i][j] && grid[i][j] == '1') {
					 cnt++;
					 dfs(grid, i, j, n, m, isVisited);
				 }
			 }
		 return cnt;
	 }
	 
	 //找到一个为1的节点，通过dfs将与之关联的节点都设置成已访问
	 public void dfs(char[][] grid, int i, int j, int n, int m, boolean[][] isVisited) {
		 if(!isValid(i, j, n, m) || isVisited[i][j] || grid[i][j] == '0')
			 return;
		 isVisited[i][j] = true;
		 dfs(grid,i-1,j,n,m,isVisited);
		 dfs(grid,i+1,j,n,m,isVisited);
		 dfs(grid,i,j-1,n,m,isVisited);
		 dfs(grid,i,j+1,n,m,isVisited);
	 }
	 
	 public boolean isValid(int i, int j, int n, int m) {
		 if(i < 0 || i >=n || j < 0 || j>=m)
			 return false;
		 return true;
	 }
	 	
}
