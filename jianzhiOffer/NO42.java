package code;

public class NO42 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int FindGreatestSumOfSubArray(int[] array) {
		if(array == null || array.length == 0){
			return 0;
		}
		
		//以当前节点为结束点的和
		int res = 0;
		//已当前节点为结束点子串的最大和
		int res1 = 0x80000000;
		
		for(int i=0;i<array.length;i++){
			if(res<0){
				res = array[i];
			}else{
				res += array[i];
			}
			if(res>res1){
				res1 = res;
			}
		}
		
		
		return res1;
    }
}
