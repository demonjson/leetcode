package code;

public class NO11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//求两条线围起来的面积（容量），面积是由最短的决定的
	public int maxArea(int[] height) {
	    int i = 0, j = height.length-1;
		int max = 0;
	    
	    while(i<j){
			int res = Math.min(height[i], height[j])*(j-i);
			max = res > max ? res:max;
			
			//面积是由i的决定的，所以不管j怎么移动，都不管用，所以需要i右移尝试找到更高的
			if(height[i]<height[j])
				i++;
			else
				j--;
				
		}
		
		return max;
	}

}
