package code;

import java.util.HashSet;
import java.util.Set;

public class NO128 {
	
	public int longestConsecutive(int[] nums) {
		//set去重插入复杂度是o(n)
		int result = 0;
		Set<Integer> S = new HashSet<Integer>();
		for(int n: nums)
			S.add(n);
		for(int n: nums) {
			int max = 1;
			while(S.contains(++n))
				max++;
			result = Math.max(max, result);
		}
		return result;
    } 
}
