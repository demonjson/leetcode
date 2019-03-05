package code;

public class NO58_2 {

	
	public static void main(String[] args) {
		

	}

	public String LeftRotateString(String str,int n) {
        if(str == null || str.length() == 0 || n>=str.length())
        	return str;
        
		char[] c = str.toCharArray();
        inverse(c, 0, n-1);
		inverse(c, n, str.length()-1);
		inverse(c, 0, str.length()-1);
		return new String(c);
    }
	
	public void inverse(char[] s,int i,int j){
		while(i<j){
			char t = s[i];
			s[i] = s[j];
			s[j] = t;
			i++;
			j--;
		}
	}
}
