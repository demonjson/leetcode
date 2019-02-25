package code;

public class NO16 {


	public static void main(String[] args) {
		
		System.out.println(Power(2.1, 3));
	}

	 public static double Power(double base, int exponent) {
	     if(base==0.0 && exponent<0){
	    	 return 0.0;
	     }
	     int ex1 = exponent;
	     if(ex1<0){
	    	 ex1 = -1*ex1;
	     }
	     double result = get(base,ex1);
	     if(exponent<0){
	    	 result = 1.0/result;
	     }
		 return result;
	 }
	 
	 public static double get(double base,int exponent){
		 if(exponent == 0)
			 return 1;
		 if(exponent == 1)
			 return base;
		 double res = get(base,exponent>>1);
		 res *= res;
		 if((exponent & 1) == 1){
			 res *= base;
		 }
		 return res;
	 }
}
