package code;

import java.util.Arrays;

public class NO61 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length == 0)
            return false;
        Arrays.sort(numbers);
        int cnt0 = 0;
        int cnt1 = 0;
        for(int i = 0;i < numbers.length-1; i++){
            if(numbers[i] == 0 ){
                cnt0++;
                continue;
            }
            if(numbers[i] == numbers[i+1]){
                return false;
            }    
            cnt1+= numbers[i+1]-numbers[i]-1;    
        }
        //应该是<=(存在0,0,0,0,9这种情况)
        if(cnt1 <= cnt0)
            return true;
        else
            return false;
    }
}
