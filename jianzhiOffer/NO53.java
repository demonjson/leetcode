package code;

import java.io.ObjectInputStream.GetField;

public class NO53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[]{1,2,3,3,3,3,4,5};
		new NO53().GetNumberOfK(a, 3);
	}
	
	public int GetNumberOfK(int [] array , int k) {
		   if(array==null || array.length == 0)
			   return 0;
		   int cnt = 0;
	       int i = findFirst(array, k, 0, array.length-1);
	       int j = findEnd(array, k, 0, array.length-1);
	       System.out.println(i+" "+j);
	       if(i > -1 && j> -1){
	    	   cnt = j-i+1;
	       }
	       return cnt;
    }
	
	public int findFirst(int[] array,int k,int start,int end){
		if(start>end)
			return -1;
		int middle = (start+end)/2;
		if(k==array[middle]){
			if(middle == 0 || (middle>0 && array[middle-1]!=k))
				return middle;
			else
				end = middle - 1;
		}else if(k<array[middle]){
			end = middle - 1;
		}else{
			start = middle + 1;
		}
		return findFirst(array, k, start, end);
	}
	
	public int findEnd(int[] array,int k,int start,int end){
		
		if(start>end)
			return -1;
		int middle = (start+end)/2;
		if(k==array[middle]){
			if(middle == array.length-1 || (middle<array.length-1 && array[middle+1]!=k))
				return middle;
			else
				start = middle + 1;
		}else if(k<array[middle]){
			end = middle - 1;
		}else{
			start = middle + 1;
		}
		return findEnd(array, k, start, end);
	}
}
