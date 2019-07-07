package code;

public class NO238 {

	//不使用除法时，就是使用当前下标前面的乘积和和后面的乘积和相乘
    public int[] productExceptSelf(int[] nums) {
    	if(nums == null || nums.length<1)
    		return null;
    	int n = nums.length;
    	int mul = 1;
    	int[] res = new int[n];
    	res[0] = 1;
    	for(int i = 1; i<n; i++)
    		res[i] = res[i-1]*nums[i-1];
    	for(int i = n-1; i>=0; i--) {
    		res[i] = res[i] * mul;
    		mul = mul*nums[i];
    	}
    	return res;	
   
    }
}
