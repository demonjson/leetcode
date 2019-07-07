package code;

public class NO198 {

	 public int rob(int[] nums) {
		 if(nums == null || nums.length<1)
			 return 0;
		 //max1��ʾ��ǰ�ڵ��
		 //max2��ʾ��ǰ�ڵ㲻��
		 int max1 = 0;
		 int max2 = 0;
		 for(int i = 0; i<nums.length;i++) {
			int max11 = max1, max22 = max2;
			max1 = max22 + nums[i];
			max2 = Math.max(max11, max22);
		 }
		 return Math.max(max1, max2);
	 
	 }
}
