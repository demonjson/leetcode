package code;

public class NO31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int []{1,2};
		new NO31().nextPermutation(a);
	}
	
	public void nextPermutation(int[] nums) {
        int length = nums.length;
        int t = -1;
        
        /*
        1　　2　　7　　4　　3　　1

        1　　2　　7　　4　　3　　1

        1　　3　　7　　4　　2　　1

        1　　3　　1　　2　　4　　7
        */
        
        //从后遍历，直到遇到数字变小，然后从后找到比这个的数字大的，交换，再转置（转置是t+1的位置）
        for(int i = length-1; i>0;i--){
        	if(nums[i-1]<nums[i]){
        		t = i-1;
        		break;
        	}
        }
    
        for(int i = length-1; i>t;i--){
        	if(t!=-1 && nums[i]>nums[t]){
        		int temp = nums[i];
        		nums[i] = nums[t];
        		nums[t] = temp;
        		break;
        	}
        }
        
     
        //因为初始化t=-1，所以针对于降序的，也符合
        t++;
        for(int i = t,j=length-1;i<j;i++,j--){
        	int temp = nums[i];
        	nums[i] = nums[j];
        	nums[j] = temp;
        }
    }

}
