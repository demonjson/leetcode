package code;

public class NO280 {
	//要求不能改变非零数的相对应的位置关系，
	//而且不能拷贝额外的数组，那么只能用替换法in-place来做，
	//需要用两个指针，一个不停的向后扫，找到非零位置，然后和前面那个指针交换位置即可
	public void moveZeroes(int[] nums) {
        int j = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				int t = nums[i];
				nums[i] = nums[j];
				nums[j] = t;
				j++;
			}
		}
    }
}
