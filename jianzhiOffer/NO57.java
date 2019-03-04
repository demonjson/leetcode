package code;

import java.util.ArrayList;

public class NO57 {

	
	public static void main(String[] args) {
		

	}

	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> result = new ArrayList<Integer>();
        if(array == null || array.length ==0 )
            return result;
        int i = 0;
        int j = array.length - 1;
        while(i<j){
            if(array[i]+array[j]==sum){
                result.add(array[i]);
                result.add(array[j]);
                break;
            }else if(array[i]+array[j]>sum){
                j = j-1;
            }else{
                i = i+1;
            }
        }
        return result;
	}
}
