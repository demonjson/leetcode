package code;

public class NO66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1};
		new NO66().multiply(a);
	}
	
	 public int[] multiply(int[] A) {
	        if(A==null)
	            return null;
	        if(A.length == 0)
	            return  new int[0];
	        int length = A.length;
	        int [] B = new int [length];
	        int [] C = new int [length];
	        int [] D = new int [length];
	        C[0] = 1;
	        for(int i = 1;i<length;i++){
	            C[i] = A[i-1]*C[i-1];
	        }
	        D[length-1] = 1;
	        for(int i=length-2;i>=0;i--){
	            D[i]= D[i+1]*A[i+1];
	        }
	        for(int i = 0;i<length;i++){
	            B[i] = C[i]*D[i];
	        }
	        
	        return B;    
	     }

}
