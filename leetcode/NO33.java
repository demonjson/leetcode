package code;

public class NO33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int search(int[] nums, int target) {
		int i = 0,j = nums.length - 1;
		while(i<=j){
			int mid = (i+j)/2;
			if(nums[mid] == target)
				return mid;
			if(nums[i]<=nums[mid]){
				if(nums[i]<=target && target<nums[mid])
					j = mid -1;
				else
					i = mid +1;
			}else{
				if(nums[mid]<target && target<=nums[j])
					i = mid+1;
				else
					j = mid-1;
			}
		}
		return -1;
    }
}
