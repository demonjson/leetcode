package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NO4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n,m,target;
		target = in.nextInt();
		n = in.nextInt();
		m = in.nextInt();
		int [][]a = new int [n][m];
		for(int i = 0; i<n; i++)
			for(int j = 0; j<m; j++){
			a[i][j] = in.nextInt();
		}
		in.close();
		System.out.println(Find(target,a));
	}
	
	public static boolean Find(int target, int [][] array) {
		/*
		利用二维数组由上到下，由左到右递增的规律，
		那么选取右上角（或者左下角）的元素a[row][col]与target进行比较，
		当target小于元素a[row][col]时，那么target必定在元素a所在行的左边,
		即col--；
		当target大于元素a[row][col]时，那么target必定在元素a所在列的下边,
		即row++；
		*/
	
		int row = 0;
		int col = array[0].length-1;
		while(row<=array.length-1 && col >= 0){
			if(target == array[row][col])
				return true;
			else if(target < array[row][col]){
				col--;
			}
			else{
				row++;
			}
		}
		
		return false;
    }

}
