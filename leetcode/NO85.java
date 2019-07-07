package code;

public class NO85 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//二维矩阵每一层及向上都可以看做一个直方图，输入矩阵有多少行，就可以形成多少个直方图
	//hegihts[i]记录当前行往上的高度，及连续1的个数
	public int maximalRectangle(char[][] matrix) {
        int res = 0;
        if(matrix == null || matrix.length < 1)
        	return res;
        int[] heights = new int[matrix[0].length];
        for(int i = 0; i<matrix.length;i++){
        	for(int j = 0; j<matrix[0].length;j++)
        		if(matrix[i][j] == '0')
        			heights[j] = 0;
        		else
        			heights[j]+= 1;
        	res = Math.max(res, largestRectangleArea(heights));
        }
        return res;
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
