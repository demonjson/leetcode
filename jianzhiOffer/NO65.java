package code;

public class NO65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int Add(int num1,int num2) {
		int sum = 0;
		int c = 0;
	    do
	    {
	    	sum = num1^num2;
	        c = (num1 & num2)<<1;
	        num1 = sum;
	        num2 = c;
	    }while(num2!=0);
	    return num1;
	}

}
