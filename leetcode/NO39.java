package code;

import java.util.ArrayList;
import java.util.List;

public class NO39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = new int[]{1,2,3,4,5};
		new NO39().combinationSum(a, 5);
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		getResult(candidates, 0, target, res, new ArrayList<Integer>());
//		for(List<Integer> list :res){
//			for(Integer t : list)
//				System.out.print(t+" ");
//			System.out.println();
//		}
		return res;	
	}
	
	
	public void getResult(int []candidates, int index, int sum, List<List<Integer>> res, List<Integer> t){
		if(sum == 0){
			//这里一定要new
			List<Integer> temp = new ArrayList<Integer>(t);
			res.add(temp);
		
			return;
		}
		if(sum < 0)
			return;
		for(int i = index; i<candidates.length; i++){
			 sum-=candidates[i];
			 t.add(candidates[i]);
			 getResult(candidates, i, sum, res, t);
			 sum+=candidates[i];
			 t.remove(t.size()-1);
		}
	}

}
