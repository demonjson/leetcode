package code;
//
public class NO3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean []a = new boolean [length];
        for(int i = 0;i<length;i++){
            if(a[numbers[i]]==true){
                duplication[0]=numbers[i];
                return true;
            }
           a[numbers[i]]=true;   
        }
        return false;
    }

}
