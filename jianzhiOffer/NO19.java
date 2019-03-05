package code;

public class NO19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public boolean match(char[] str, char[] pattern)
    {
        if(str == null || pattern == null)
            return false;
        return matchCore(str,0,pattern,0);
    }
    
	//特殊情况 ""和".*"
    public boolean matchCore(char[] str, int i, char[] pattern, int j){
        if(i == str.length && j == pattern.length)
            return true;
        if(i < str.length && j == pattern.length)
            return false;
        if(j+1<pattern.length && pattern[j+1]=='*'){
            if((i<str.length && str[i] == pattern[j]) || (i<str.length&&pattern[j]=='.'))
                return matchCore(str,i+1,pattern,j+2) || matchCore(str,i,pattern,j+2) || matchCore(str,i+1,pattern,j);
            else
                return matchCore(str,i,pattern,j+2);
        }
        if((i<str.length && str[i] == pattern[j]) || (i<str.length && pattern[j]=='.'))
            return  matchCore(str,i+1,pattern,j+1);
        return false;
    }
}
