package code;

public class NO50_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 	}
	int[] a = new int [256]; 
	int index;
	public NO50_2() {
		 for(int i=0;i<256;i++){
	            a[i] = -1;
	        }
	        index = 0;
	}
    //Insert one char from stringstream
  
    public void Insert(char ch)
    {
    	//数组下表为ascii,保存的值为最后出现的次序
    	//-1，当前字符还没出现过，-2出现过多次，>=0,只出现过一次
        if(a[ch]==-1){
            a[ch]=index;
        }else if(a[ch]>=0){
            a[ch] = -1;
        }
        index++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char c = '#';
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<256;i++){
            if(a[i]>=0 && a[i]<min){
                min = a[i];
                c = (char)i;
            }
        }
        return c;
    }

}
