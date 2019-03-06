package code;

public class NO12 {

	 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix == null || str == null || rows <1 || cols <1)
            return false;
        boolean[] visited = new boolean[rows*cols];
        
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++){
                if(PathCore(matrix,rows,cols,str,i,j,0,visited)){
                    return true;
                }
            }
        return false;
    }

    public boolean PathCore(char[] matrix, int rows ,int cols, char[] str,
                            int i, int j, int index, boolean[] visited){
        if(index == str.length)
            return true;
        boolean flag = false;
        if(i >= 0 && i < rows && j >= 0 && j < cols && matrix[i*cols+j] == str[index]
              && visited[i*cols+j] == false){
            index ++;
            visited[i*cols+j] = true;
            flag =  PathCore(matrix,rows,cols,str,i,j-1,index,visited) ||
                    PathCore(matrix,rows,cols,str,i,j+1,index,visited) ||
                    PathCore(matrix,rows,cols,str,i-1,j,index,visited) ||
                    PathCore(matrix,rows,cols,str,i+1,j,index,visited);
            //回溯法
            if(flag == false){
                index --;
                visited[i*cols+j] = false;
            }
        }
        
        return flag;
    }
	

}
