package code;

public class NO10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab";
		String pattern = ".*c";
		System.out.println(new NO10().isMatch(str, pattern));
	}
	
	public boolean isMatch(String s, String p) {
		return isMatchFun(s,0,p,0);
	}
	
	//特殊情况 ""和".*"
	public boolean isMatchFun(String s, int i, String p, int j){
		if(i == s.length() && j == p.length())
			return true;
		if(i < s.length() && j == p.length())
			return false;
		// *出现0次，1次,多次
		if(j+1<p.length() && p.charAt(j+1)=='*'){
			if(i<s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j)=='.'))
				return isMatchFun(s, i, p, j+2) || isMatchFun(s, i+1, p, j+2) ||isMatchFun(s, i+1, p, j);
			else
				return isMatchFun(s, i, p, j+2);
		}
	    if(i<s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j)=='.'))
            return isMatchFun(s, i+1, p, j+1);
			
		return false;
	}

}
