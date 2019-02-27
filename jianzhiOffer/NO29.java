package code;

import java.util.ArrayList;
import java.util.List;

public class NO29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		new NO29().printMatrix(a);
	}
	
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		ArrayList <Integer>result = new ArrayList<Integer>();
		int start = 0;
		while(m>start*2 && n>start*2){
			int x = m-1-start;
			int y = n-1-start;
			for(int i=start;i<=y;i++){
				result.add(matrix[start][i]);
			}
			if(start<x){
				for(int i = start+1;i<=x;i++)
					result.add(matrix[i][y]);
			}
			if(start<x && start<y){
				for(int i = y-1;i>=start;i--)
					result.add(matrix[x][i]);
			}
			if(start<x && start<y){
				for(int i = x-1;i>start;i--)
					result.add(matrix[i][start]);
			}
			start++;
		}
		for(Integer t : result)
			System.out.println(t);
			
		return result;
    }

  	
	
}
