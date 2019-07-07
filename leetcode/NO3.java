package code;

import java.util.HashMap;
import java.util.Map;

public class NO3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.print(new NO3().lengthOfLongestSubstring(s));
	}

	//需要考虑空格等特殊字符，不仅仅包含小写字母
	public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int current = 0;
        
        Map <String,Integer>res = new HashMap<String,Integer>();
		for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			int preIndex = -1;
			String s1 = String.valueOf(c);
			if(res.containsKey(s1)){
				preIndex = res.get(s1);
			}
			
			
			if(preIndex == -1 || i-preIndex>current){
				current ++;
			}else{
				current = i-preIndex;
			}
			res.put(s1, i);
			if(current>max)
				max = current;
		}
		
		return max;
    }
}
