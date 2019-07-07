package code;

public class NO169 {

	public int majorityElement(int[] nums) {
		int cnt = 1;
		int res = nums[0];
		
		for(int i = 1; i < nums.length; i++)
			if(nums[i] == res)
				cnt++;
			else {
				cnt--;
				if(cnt == 0) {
					res = nums[i];
					cnt = 1;
				}
					
			}
		return res;
	}
}
