package code;

public class NO152 {
	
	public static void main(String[] args) {
		int[] nums = {-2,3,-4};
		System.out.println(new NO152().maxProduct(nums));
	}
	
	
	//��̬�滮
	//dp1�������Ե�ǰ�ڵ�Ϊ���ڵ�����������г˻����
	//dp2�������Ե�ǰ�ڵ�Ϊ���ڵ�����������г˻���С
	//�µ�dp1��dp2������ǰ��dp1,dp2��nums[i]
	public int maxProduct(int[] nums) {
		if(nums == null || nums.length < 1)
			return 0;
		int length = nums.length;
        int dp1 = nums[0];
        int dp2 = nums[0];
        int result = dp1;
        for(int i = 1; i < length; i++) {
        	int max1 = dp1*nums[i];
        	int max2 = dp2*nums[i];
        	dp1 = Math.max(nums[i],Math.max(max1, max2));
        	dp2 = Math.min(nums[i],Math.min(max1, max2));
        	if(dp1>result)
        		result = dp1;
        }
        return result;
    }
}
