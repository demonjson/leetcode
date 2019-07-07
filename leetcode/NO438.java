package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NO438 {
	
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> res = new ArrayList<>();
		int length = p.length();
		int[] a = new int[26];
		for(int i = 0; i < p.length(); i++) {
			a[p.charAt(i)-'a']++;
		}
		for(int i = 0; i + length< s.length(); i++) {
			String sub = s.substring(i, i+length);
			
			int[] b = new int[26];
			for(int j = 0; j < sub.length(); j++) {
				b[sub.charAt(j)-'a']++;
			}
			
			int flag = 0;
			for(int j = 0; j<26; j++) {
				if(a[j] != b[j]) {
					flag = 1;
					break;
				}
				
			}
			
			if(flag == 0)
				res.add(i);
		}
		return res;
	}
}
