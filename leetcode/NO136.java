package code;

public class NO136 {
	
	//ͨ����������
	public int singleNumber(int[] nums) {
        int res = 0;
		for(int n : nums) {
        	res^=n;
        }
		return res;
    }
}
