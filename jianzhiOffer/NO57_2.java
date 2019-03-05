package code;

import java.util.ArrayList;

public class NO57_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        if(sum < 3)
	           return result;
	        int a = 1;
	        int b = 2;
	        int middle = (sum+1)/2;
	        int add = 3;
	        while(a<middle){
	            if(add == sum){
	            	
	            	//如果相等时，后面的指针继续后移，寻找下一个符合条件的
	                //{1,2,3,4,5} sum = 9 {2,3,4},{4,5}
	            	fun(result,a,b);  
	                b++;
	                add+=b;
	            }
	            if(add > sum){
	                add-=a;
	                a++;
	            }
	            if(add < sum){
	                b++;
	                add+=b;
	            }
	        }
	        return result;
	    }
	    
	    public void fun(ArrayList<ArrayList<Integer>> result,int a,int b){
	         ArrayList<Integer> t= new ArrayList<Integer>();
	         for(int i = a;i<=b;i++)
	             t.add(i);
	         result.add(t);
	    }
}
