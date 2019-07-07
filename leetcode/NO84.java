package code;

public class NO84 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,5,6,2,3};
		new NO84().largestRectangleArea(a);
	}

	//局部峰值:当前节点大于后续节点的值
	//非局部峰值：当前节点小于后面的，则矩形边肯定不能包括当前节点
	public int largestRectangleArea(int[] heights) {
		int maxArea = 0;
		for(int i = 0; i<heights.length; i++){
			if(i+1 < heights.length && heights[i] <= heights[i+1])
				continue;
			int min = heights[i];
			
			//j=i 不能 j=i-1,因为要考虑当前节点组成的面积以及i=0的情况
			for(int j = i; j>=0; j--){
				min = Math.min(min, heights[j]);
				int area = min*(i-j+1);
				maxArea = Math.max(maxArea, area);
			}
		
		}
		return maxArea;
	}
}
