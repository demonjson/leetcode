package code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class NO347 {
	
	//小顶堆
	public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(int num : nums) {
        	countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(
        		new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						return countMap.get(o1)-countMap.get(o2);					}
				
        });
        for(int key : countMap.keySet()) {
        	if(queue.size() < k)
        		queue.add(key);
        	else if(countMap.get(key) > countMap.get(queue.peek())) {
        		queue.remove();
        		queue.add(key);
        	}
        }
        List<Integer> list = new ArrayList<Integer>();
        while(!queue.isEmpty()) {
        	list.add(queue.remove());
        }
        return list;
	}
}
