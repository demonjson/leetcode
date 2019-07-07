package code;

import java.util.ArrayList;
import java.util.List;

public class NO78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3};
		new NO78().subsets(a);
	}
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		getSubsets(result, nums, 0, new ArrayList<Integer>());
		for(List<Integer> list : result){
			for(Integer t : list)
				System.out.print(t+",");
			System.out.println();
		}
		return result;
    }
	
	public void getSubsets(List<List<Integer>> result, int[] nums, int index, List<Integer> t){
		
		List<Integer> temp = new ArrayList<Integer>(t);
		result.add(temp);
			
		for(int i = index; i < nums.length; i++){
			t.add(nums[i]);
			getSubsets(result, nums, i+1, t);
			t.remove(t.size() - 1);
		}
		
		
	}
}
