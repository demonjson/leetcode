package code;

import java.util.ArrayList;
import java.util.List;

public class NO17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static String []keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};	
	public List<String> letterCombinations(String digits) {
	       
		List<String> result = new ArrayList<String>();
		if(digits .equals(""))
			return result;
		
		combination(0, digits, "", result);
		return result;
	}
	
	//index:digits中第一个数字，digits:数字串，str:结果串
	public void combination(int index, String digits,String str,List<String> result){
		if(index==digits.length()){
			result.add(str);
			return;
		}
		String letters = keys[digits.charAt(index)-'0'];
		for(int i = 0;i<letters.length();i++){
			combination(index+1, digits, str+letters.charAt(i), result);
		}
		
	}

}
