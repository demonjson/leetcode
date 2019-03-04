package code;

import java.util.Arrays;
import java.util.Comparator;


public class NO45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String PrintMinNumber(int [] numbers) {
		int length = numbers.length;
		if(numbers == null || length ==0 )
			return "";
		String[] str = new String[length];
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<length;i++){
			str[i] = String.valueOf(numbers[i]);
		}
		 
		Arrays.sort(str, new Comparator<String>() {

			public int compare(String s1, String s2) {
				String c1 = s1 + s2;
				String c2 = s2 + s1;
				return c1.compareTo(c2);
			}
			
		});
		
		for(int i = 0;i<length;i++){
			sb.append(str[i]);
		}
		return sb.toString();
	}
}
