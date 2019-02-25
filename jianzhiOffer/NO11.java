package code;

import java.util.Scanner;
public class NO11 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		System.out.print(minNumberInRotateArray(a));
		in.close();
		 
	}

	public static int minNumberInRotateArray(int [] array) {
		
		
	    int i = 0;
	    int j = array.length - 1;
	    //在有序情况下的处理（1,2,3,4,5,6,）
	    int mid = i;
	    while(array[i]>=array[j]){
	    	if(i+1==j){
	    		mid = j;
	    		break;
	    	}
	    		
	    	mid = (i+j)/2;

	    	//相等情况下的处理（1,0,1,1,1,1）
	    	if(array[i] == array[mid])
	    		return get(array,i,j);
	    		
	    	if(array[i]<=array[mid])
	    		i = mid;
	    	else if(array[j]>=array[mid])
	    		j = mid;
	    }
		return  array[mid];
    }
	
	public static int get(int [] array,int i, int j) {
		int min = array[i];
		for(int k = i+1;k<=j;k++){
			if(array[k]<min)
				min = array[k];
		}
		return min;
    }
}
