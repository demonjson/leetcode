package code;

public class NO287 {

	//二分查找改造法(超时)
	//求出数组的mid(下标+1)，判断数组小于等于mid的个数
	//如果个数小于等于mid，这说明重复的数字是大于mid的
	//如果大于，则说明重复的数字是小于等于mid的
	public int findDuplicate(int[] nums) {
		int i = 0, j = nums.length;
		while(i<j) {
			int mid = (i+j)/2;
			int cnt = 0;
			for(int num : nums)
				if(num <= mid) 
					cnt++;
			if(cnt <= mid)
				i = mid+1;
			else if(cnt > mid)	
				j = mid;
				
		}
		return j;
	}
}
