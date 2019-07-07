package code;

import java.util.ArrayList;
import java.util.List;

public class NO448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> res = new ArrayList<>();
    	int[] a = new int [nums.length+1];
    	for(int num : nums)
    		a[num] = 1;
    	for(int i = 1; i<a.length; i++)
    		if(a[i] == 0)
    			res.add(i);
    	return res;
    }
}
