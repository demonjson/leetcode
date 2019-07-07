package code;

public class NO70 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int climbStairs(int n) {
		if(n <= 2)
			return n;
		int []a = new int [n+1];
		a[1] = 1;
		a[2] = 2;
		for(int i = 3; i<=n; i++)
			a[i] = a[i-1] + a[i-2];
		return a[n];
	}
	
}
