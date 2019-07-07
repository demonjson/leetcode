package code;

public class NO34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] searchRange(int[] nums, int target) {
	     int a[] = new int [2];
	     a[0] = findFirst(nums, target);
	     a[1] = findLast(nums, target);
	     return a;
	}
	
	public int findFirst(int[] nums, int target){
		int i = 0,j = nums.length-1;
		int res = -1;
		while(i<=j){
			int mid = (i+j)/2;
			if(nums[mid] == target){
				if(mid == 0 || (mid>0 && nums[mid-1]!=target)){
					res = mid;
					break;
				}
				else
					j = mid - 1;
			}else if(nums[mid]>target){
				j = mid - 1;
			}else
				i = mid +1;
		}
		return res;
	}

	public int findLast(int[] nums, int target){
		int i = 0,j = nums.length-1;
		int res = -1;
		while(i<=j){
			int mid = (i+j)/2;
			if(nums[mid] == target){
				if(mid == nums.length -1 || (mid<nums.length-1 && nums[mid+1]!=target)){
					res = mid;
					break;
				}
				else
					i = mid + 1;
			}else if(nums[mid]>target){
				j = mid - 1;
			}else
				i = mid +1;
		}
		return res;
	}
}
