package code;

public class NO13 {

	
	    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int movingCount(int threshold, int rows, int cols)
	    {
	        if(threshold < 0 || rows <= 0 || cols <= 0)
	            return 0;
	        boolean[] visited = new boolean [rows*cols];
	        return count(threshold,0,0,rows,cols,visited);
	    }
	    
	    public int count(int threshold,int i,int j,int rows, int cols,boolean[] visited){
	        int count = 0;
	        if(check(threshold,i,j,rows,cols,visited)){
	            visited[i*cols+j] = true;
	            count = 1+count(threshold,i,j+1,rows,cols,visited) +
	                      count(threshold,i,j-1,rows,cols,visited) +
	                      count(threshold,i-1,j,rows,cols,visited) +
	                      count(threshold,i+1,j,rows,cols,visited);
	        }
	        return count;
	    }
	    
	    public boolean check(int threshold,int i,int j,int rows,int cols,boolean[] visited){
	        if(i>=0 && i<rows && j>=0 && j<cols && visited[i*cols+j] == false
	              &&(sum(i)+sum(j)<=threshold))
	            return true;
	        return false;
	    }
	    
	    public int sum(int n){
	        int sum = 0;
	        while(n!=0){
	            sum += n%10;
	            n = n/10;
	        }
	        return sum;
	    }

}
