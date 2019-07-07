package code;

public class NO53 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int sum = nums[0];
		for(int i = 1; i<nums.length; i++){
			if(sum < 0)
				sum = 0;
			sum += nums[i];
			if(sum > max)
				max = sum;
		}
		return max;
	}
}
