package code;

import java.util.ArrayList;
import java.util.List;

public class NO22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public List<String> generateParenthesis(int n) {
	    List<String> result = new ArrayList<String>();    
	    getString(result,n,n,"");
	    return result;
	}

	//left 表示剩余（个数，right表示剩余）个数
	//当left或right小于0，说明（或）超出
	//当left>right,说明当前串中，（个数小于）个数，不符合：任意符合的串在任意时候（个数大于）个数
	public void getString(List<String> result,int left,int right,String str){
		if(left<0 || right<0 || left>right)
			return;
		if(left == 0 && right == 0){
			result.add(str);
			return;
		}
		getString(result, left-1, right, str+"(");	
		getString(result, left, right-1, str+")");	
		
	}
}
