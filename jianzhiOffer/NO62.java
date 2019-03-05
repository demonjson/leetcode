package code;

public class NO62 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public int LastRemaining_Solution(int n, int m) {
        if(n < 1 || m < 1)
            return -1;
        int res = 0;
        for(int i = 2;i<=n;i++){
            res = (res+m)%i;
        }
        return res;
    }

}
