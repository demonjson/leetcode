package code;

public class NO739 {
	 public int[] dailyTemperatures(int[] T) {
		 int n = T.length;
		 int[] res = new int[n];
		 for(int i = 0; i<n; i++) {
			 int j = i+1;
			 while(j < n && T[j] <= T[i]) {
				 j++;
			 }
			 if(j < n)
				 res[i] = j - i;
		 }
		 return res;
	 }
}
