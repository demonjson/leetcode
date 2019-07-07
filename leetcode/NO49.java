package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NO49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
        int []count = new int [26];
		Map<String, List<String>> result = new HashMap<String, List<String>>();
		for(int i = 0; i<strs.length; i++){
			Arrays.fill(count, 0);
			for(char c : strs[i].toCharArray()){
				count[c-'a']++;
			}
			StringBuffer sb = new StringBuffer();
			for(int j = 0; j<26; j++){
				sb.append(count[j]);
				sb.append("#"); //必须有间隔符（解决这种问题： 1 ，12 和11，2）
			}
			
			String s = sb.toString();
			if(!result.containsKey(s)){
				result.put(s, new ArrayList<String>());
			}
			result.get(s).add(strs[i]);
		}
		
		
		return new ArrayList<>(result.values());
		
    }

}
