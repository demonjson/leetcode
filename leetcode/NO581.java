package code;

public class NO581 {
	
	public static void main(String[] args) {
		int []a = {1,3,2,2,2};
		new NO581().findUnsortedSubarray(a);
	}
	
	public int findUnsortedSubarray(int[] nums) {
		int start = -1;
		int res = 0;
		for(int i = 1; i<nums.length; i++) {
			if(nums[i]<nums[i-1]) {
				int j = i;
				while(j > 0 && nums[j] < nums[j-1]) {
					swap(nums,j);
					j--;
				}
				
				if(start == -1 || start > j)
					start = j;
			
				res = i - start + 1;
			}
		}
		return res;
    }
	
	public void swap(int[] nums, int j) {
		int t = nums[j];
		nums[j] = nums[j-1];
		nums[j-1] = t;
	}
}
