package code;

import java.util.ArrayDeque;

public class NO239 {
	
	//用队列保存下标
	//添加元素用add方法，不能用push方法
	public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums == null)
			return null;
		if(nums.length == 0)
			return new int[0];
		int[] res = new int[nums.length - k + 1];
		int cnt = 0;
		ArrayDeque<Integer> quene = new ArrayDeque<Integer>();
		for(int i = 0; i<k; i++) {
			while(!quene.isEmpty() && nums[i] >= nums[quene.peekLast()])
				quene.pollLast();
			quene.add(i);
		}
		
		for(int i = k; i < nums.length; i++) {
			res[cnt++] = nums[quene.peekFirst()];
			while(!quene.isEmpty() && nums[i] >= nums[quene.peekLast()])
				quene.pollLast();
			
			if(!quene.isEmpty() && i-quene.peekFirst()>=k) {
				quene.pollFirst();
			}
			quene.add(i);
		}
		res[cnt] = nums[quene.peekFirst()];
		return res;
	}
}
