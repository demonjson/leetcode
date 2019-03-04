package code;

import java.util.*;
public class NO40 {

	
	public static void main(String[] args) {
		int a[]={4,5,1,6,2,7,3,8};
		new NO40().GetLeastNumbers_Solution(a, 4);
	}
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int length = input.length;
		if(k>length || k<=0)
			return result;
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
			     return o2.compareTo(o1);
			     }
		});
		
		for(int i = 0;i<length;i++){
			if(maxHeap.size()<=k){
				maxHeap.offer(input[i]);
			}else if(maxHeap.peek()>input[i]){
				maxHeap.poll();
				maxHeap.offer(input[i]);
			}
		}
		for(Integer t : maxHeap){
			result.add(t);
			System.out.println(t);
		}
		return result;
	}

}
