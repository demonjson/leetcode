package code;

public class NO1 {

	//PO1
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
 
	
	//
	 public int[] twoSum(int[] nums, int target) {
	        int []a = new int [2];
	        for(int i = 0; i<nums.length; i++){
	            for(int j = i+1; j<nums.length; j++){
	                if(nums[i]+nums[j]==target){
	                    a[0] = i;
	                    a[1] = j;
	                    return a;
	                }
	            }
	        }
	        return a;
	 }
}
