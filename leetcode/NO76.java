package code;

public class NO76 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.print(new NO76().minWindow(s, t));
	}
	
	/*
	 * 1) begin,end指向起始位置
	 * 2) end先后移，直到s的begin~end区间内包含t所有字符，记录下距离distance
	 * 3) begin后移移除字符，直到遇到t中的一个字符
	 * 4) end继续后移，直到包含所有字符，记录距离, 更新distance
	 */
	public String minWindow(String s, String t) {
        int begin = 0, end = 0, head = 0, cnt = t.length(); 
		int distance = Integer.MAX_VALUE;
        int []count = new int [128];
        //用数组记录t串字符出现的次数
        for(int i = 0; i < t.length(); i++){
        	count[t.charAt(i)]++;
        }
      
        while(end < s.length()){
        	if(count[s.charAt(end++)]-- > 0){
        		cnt--;
        	}
        	while(cnt == 0){
        		if(distance > end - begin){
        			distance = end - begin;
        			head = begin;
        		}
        		if(count[s.charAt(begin++)]++ == 0)
        			cnt++;
        	}
        	
        }
        
		return distance == Integer.MAX_VALUE ? "":s.substring(head,head+distance);
	}
}
