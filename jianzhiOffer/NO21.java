package code;

public class NO21 {

	
	public static void main(String[] args) {
		int a[] = {2,4,6,1,3,5,7};
		new NO21().reOrderArray(a);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	 public void reOrderArray(int [] array) {
		int cnt = 0;
		for(int i=0;i<array.length;i++){
			 if(array[i]%2==0)
				 cnt++;
		}
		 
        for(int i=0;i<array.length;i++){
        	if(cnt==0)
        		break;
        	if(array[i]%2==0){
        		cnt--;
        		int t = array[i]; 
        		for(int j =i+1;j<array.length;j++){
        			array[j-1]=array[j];
        		}
        		array[array.length-1]=t;
        		i--;
        	}
        }
    }

}
