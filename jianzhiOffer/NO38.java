package code;

import java.util.ArrayList;
import java.util.Collections;

public class NO38 {

	static ArrayList<String> result = new ArrayList<String>();
	public static void main(String[] args) {
		
		
		new NO38().Permutation(new String("aa"));
		for(String s : result){
			System.out.println(s);
		}
	}
	
	public ArrayList<String> Permutation(String str) {
		if(str == null || str.length() == 0)
			return result;
		get(new StringBuffer(str),0);
		Collections.sort(result);
	    return result;   
	}
	
	public void get(StringBuffer sb,int index){ 
		if(index == sb.length()){
			if(!result.contains(sb.toString())){
				result.add(sb.toString());
			}
			
		}else{
			for(int j = index;j<sb.length();j++){
				char temp = sb.charAt(j);
				sb.setCharAt(j, sb.charAt(index));
				sb.setCharAt(index, temp);
				
				get(sb,index+1);
				
				temp = sb.charAt(j);
				sb.setCharAt(j, sb.charAt(index));
				sb.setCharAt(index, temp);
			}
		}
	}

}
