package code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class NO406 {
	public int[][] reconstructQueue(int[][] people) {
		//先按照h降序排列，如果h相同，按照k升序排序
		//排序后，按照k的值插入到list中合适的位置
		Arrays.sort(people, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0])
					return o1[1] - o2[1];
				return o2[0] - o1[0];
			}
			
		});
		
		List<int[]> list = new LinkedList<>();
		for(int[] a : people) {
			list.add(a[1], a);
		}
		return list.toArray(new int[people.length][]);
    }
}
