package code;

import java.util.Scanner;
public class NO5 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		System.out.println(replaceSpace(new StringBuffer(s)));
	}

	 public static String replaceSpace(StringBuffer str) {
		 //统计空格个数
		 int spaceCount = 0;
		 for(int i= 0; i < str.length(); i++){
			 if(str.charAt(i)==' '){
				 spaceCount++;
			 }
		 }
		 int oldindex = str.length()-1;
		 int newindex = oldindex + spaceCount * 2;
		 int newlength = newindex + 1;
		 str.setLength(newlength);
		 for(;oldindex>=0 && oldindex <= newindex ; oldindex--){
			 if(str.charAt(oldindex)== ' '){
				 str.setCharAt(newindex--, '0');
				 str.setCharAt(newindex--, '2');
				 str.setCharAt(newindex--, '%');
			 }else{
				 str.setCharAt(newindex--, str.charAt(oldindex));
			 }
		 }
		 return str.toString();
	 }
}
