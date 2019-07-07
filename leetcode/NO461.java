package code;

public class NO461 {
	
	public int hammingDistance(int x, int y) {
		int xy = x ^ y;
		int cnt = 0;
		while(xy != 0) {
			if(xy % 2 == 1)
				cnt++;
			xy/=2;
		}
		return cnt;
    }
}
