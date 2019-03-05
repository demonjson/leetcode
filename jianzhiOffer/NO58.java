package code;

public class NO58 {

	
	public static void main(String[] args) {
		
		String s = "I am a student.";
		System.out.println(new NO58().ReverseSentence(s));
	}
	
	public String ReverseSentence(String str) {
		char[] s = str.toCharArray();
		inverse(s, 0, s.length-1);
		int i = 0;
		int j = 0;
		while(i<s.length){
			if(s[i] == ' '){
				i++;
				j++;
			//j == s.length必须放在前面，不然当访问到最后一个时，会发生指针溢出
			}else if(j == s.length || s[j]==' ' ){
				inverse(s, i, j-1);
				i = j;
			}else{
				j++;
			}
			
		}
		return new String(s);
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
