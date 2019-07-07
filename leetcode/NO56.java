package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class NO56 {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Interval{
		int start;
		int end;
		public Interval(int s, int e) {
			start = s;
			end = e;
		}
	}
		
	public int[][] merge(int[][] intervals) {
		//需要考虑特殊情况
		if(intervals == null || intervals.length<1)
            return new int[0][0];
		int n = intervals.length;
		List<Interval> res = new ArrayList<Interval>();
		List<Interval> temp = new ArrayList<Interval>();
		
		for(int i = 0; i<n; i++){
			Interval t = new Interval(intervals[i][0], intervals[i][1]);
			res.add(t);
		}
		//根据start进行排序
		Collections.sort(res, new Comparator<Interval>(){

			@Override
			public int compare(Interval t1, Interval t2) {
				return t1.start - t2.start;
			}
		});
		
		int start = res.get(0).start;
		int end = res.get(0).end;
		for(int i = 1; i<res.size(); i++){
			if(res.get(i).start <= end){
				end = Math.max(end, res.get(i).end);
			}else{
				Interval t = new Interval(start, end);
				temp.add(t);
				start = res.get(i).start;
				end = res.get(i).end;
			}
		}
		Interval t = new Interval(start, end);
		temp.add(t);
		
		int [][]result = new int [temp.size()][2]; 
		for(int i = 0; i<temp.size(); i++){
			result[i][0] = temp.get(i).start;
			result[i][1] = temp.get(i).end;
		}
		return result;
    }
	

}
