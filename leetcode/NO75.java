package code;

public class NO75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//一次遍历，用三个变量n0,n1,n2分别表示访问到当前下标i时数组中已排序的0,1,2的最右端
	//进行后移操作，遍历一次
	// 0 0 1 1 1 2 2 1 i=1,j=4,k=6
	public void sortColors(int[] nums) {
		int i = -1,j = -1,k = -1;
		for(int t = 0; t<nums.length; t++){
			if(nums[t] == 0){
				nums[++k] = 2;
				nums[++j] = 1;
				nums[++i] = 0;
			}else if(nums[t] == 1){
				nums[++k] = 2;
				nums[++j] = 1;
			}else{
				nums[++k] = 2;
			}	
		}
	}
}
