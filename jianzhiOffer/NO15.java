package code;

import java.util.Scanner;

public class NO15 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(NumberOf1(n));
		in.close();
	}

	 public static int NumberOf1(int n) {
	     int count=0;
	     while(n!=0){
	    	 count++;
	    	 n=(n-1)&n;
	     }
	     return count;
	 }
	
}
