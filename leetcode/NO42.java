package code;

public class NO42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//用两个数组分别记录当前节点的左右（包括当前节点）的最高值
	//然后分段计算容量，再求和
	public int trap(int[] height) {
        if(height == null || height.length < 3)
        	return 0;
		int sum = 0;
		int []left = new int[height.length];
		int []right = new int[height.length];
		left[0] = height[0];
		right[height.length - 1] = height[height.length-1];
		for(int i = 1;i < height.length; i++){
			left[i] = height[i]>left[i-1]? height[i]:left[i-1];
		}
		for(int i = height.length - 2;i>=0; i--){
			right[i] = height[i]>right[i+1]? height[i]:right[i+1];
		}
		for(int i = 0; i<height.length; i++)
			sum+=Math.min(left[i],right[i])-height[i];
		return sum;
	}
}
