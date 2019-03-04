package code;

import java.util.HashMap;

public class NO50 {

	
	public static void main(String[] args) {
		

	}
	
	
	public int FirstNotRepeatingChar(String str) {
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
 		for(int i = 0;i<str.length();i++){
 			if(result.containsKey(str.charAt(i))){
 				int cnt = result.get(str.charAt(i));
 				//必须是++cnt,不能是cnt++
 				result.put(str.charAt(i), ++cnt);
 			}else{
 				result.put(str.charAt(i), 1);
 			}
 		}
		
 		int pos = -1;
 		for(int i =0;i<str.length();i++){
 			if(result.get(str.charAt(i)) == 1)
 				return i;
 		}
 		
		return pos;
    }

}
