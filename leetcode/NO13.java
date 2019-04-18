package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NO13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//先排序，确定第一个数，任何后面的采用头尾指针遍历
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(nums == null || nums.length<3)
    		return result;
    	Arrays.sort(nums);
    	int length = nums.length;
    	if(nums[0]>0 || nums[length-1]<0)
    		return result;
    	for(int i = 0;i < length-2;i++){
    		if(i == 0 || nums[i]!=nums[i-1]){
    			int low = i+1,high = length - 1,sum = 0-nums[i];
    			while(low<high){
    				if(nums[low]+nums[high]==sum){
    					List<Integer> t = new ArrayList<Integer>();
    					t.add(nums[i]);
    					t.add(nums[low]);
    					t.add(nums[high]);
    					result.add(t);
    					
    					//跳过重复的
    					while(low<high && nums[low]==nums[low+1])
    						low++;
    					while(low<high && nums[high]==nums[high-1])
    						high--;
    					low++;
    					high--;
    				}else if(nums[low]+nums[high]>sum){
    					high--;
    				}else{
    					low++;
    				}
    				
    			}
    		}
    	}
    	
    	return result;
    }
}
