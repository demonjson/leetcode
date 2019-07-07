package code;

import java.util.HashMap;
import java.util.Map;

public class NO560 {
	
	
	
	public int subarraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0;
		int res = 0;
		for(int num : nums) {
			sum += num;
			res += map.getOrDefault(sum-k, 0);
			if(map.containsKey(sum)) {
				map.put(sum, map.get(sum)+1);
			}else {
				map.put(sum, 1);
			}
		}
		return res;
    }
}
