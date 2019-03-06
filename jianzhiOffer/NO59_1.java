package code;

import java.util.ArrayDeque;
import java.util.ArrayList;;
public class NO59_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{2,3,4,2,6,2,5,1};
		ArrayList<Integer> result = new NO59_1().maxInWindows(a,3);
		for(Integer t : result){
			System.out.println(t);
		}
	
	}
	
	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(num.length>=size && size>=1){
        	ArrayDeque<Integer> quene = new ArrayDeque<Integer>();
        	for(int i = 0; i < size; i++){

        		while(!quene.isEmpty()&&num[i]>=num[quene.peekLast()])
        			quene.pollLast();
        		//千万不能用push，只能用add
        		quene.add(i);
        		
        	}
       	for(int i = size; i<num.length;i++){
        		result.add(num[quene.peekFirst()]);
        		while(!quene.isEmpty()&&num[i]>=num[quene.peekLast()])
        			quene.pollLast();
        		if(!quene.isEmpty() && (i-quene.peekFirst()>=size))
        			quene.pollFirst();
        		quene.add(i);
        		
        	}
        	result.add(num[quene.peekFirst()]);
        }
        	
        return result;
    }
	
	
}
