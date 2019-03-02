package code;

public class NO39 {

	
	public static void main(String[] args) {
		

	}
	
	
	public int MoreThanHalfNum_Solution(int [] array) {
		int length = array.length;
		if(length == 0)
			return 0;
		int result = array[0];
		int cnt = 1;
		for(int i = 1;i<length;i++){		
			if(cnt==0){
				cnt++;
				result = array[i];
			}else if(result == array[i]){
				cnt++;
			}else{
				cnt--;
			}
		}
		
		boolean flag = isCheck(array,result);
		if(!flag){
			result = 0;
		}
		
		return result;
    }
	
	public boolean isCheck(int [] array,int result){
		int cnt = 0;
		for(int i = 0;i<array.length;i++){
			if(array[i]==result)
				cnt++;
		}
		
		if(cnt*2>array.length)
			return true;
		else
			return false;
		
	}

}
