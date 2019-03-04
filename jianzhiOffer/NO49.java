package code;

public class NO49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int GetUglyNumber_Solution(int index) {
		if(index <= 0)
			return 0;
		int a [] = new int [index];
		a[0] = 1;
		int count = 1;
		int i = 0,j = 0,k = 0;
		while(count<index){
			int min = min(a[i]*2, a[j]*3, a[k]*5);
			a[count] = min;
			while(a[i]*2<=a[count])
				i++;
			while(a[j]*3<=a[count])
				j++;
			while(a[k]*5<=a[count])
				k++;
			count ++;
		}
		
		return a[count-1];
    }
	
	public int min(int a,int b,int c){
		int min = a < b? a:b;
		min = min < c?min:c;
		return min;
	}
	
}
