package code;

public class NO64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int Sum_Solution(int n) {
		int sum =0;
		boolean flag = (n!=0) && (n==(sum=Sum_Solution(n-1)));
		
		return n+sum;
	}
}
