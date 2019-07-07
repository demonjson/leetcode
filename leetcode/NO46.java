package code;

import java.util.ArrayList;
import java.util.List;

public class NO46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	}
	
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums == null || nums.length < 1)
			return result;
		getPermutations(nums, 0, result);
		return result;
    }
	
	//回溯法
	public void getPermutations(int[] nums, int index, List<List<Integer>> result){
		if(index == nums.length){
			List<Integer> temp = new ArrayList<Integer>();
			for(int i = 0; i < nums.length; i++)
				temp.add(nums[i]);
			result.add(temp);
			return;
		}
		
		int t = nums[index];
		for(int i = index; i<nums.length; i++){
			if(i == index)
				getPermutations(nums, index+1, result);
			else{
				nums[index] = nums[i];
				nums[i] = t;
				getPermutations(nums, index+1, result);
				nums[i] =  nums[index];
				nums[index] = t;
			}
		}
	}
	
	

}
