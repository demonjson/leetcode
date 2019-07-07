package code;

public class NO647 {
	//从中间往两边扩散
		int res = 0;
		public int countSubstrings(String s) {
			int n = s.length();
			for(int i = 0; i<n; i++) {
				helper(s, i, i, n);
				helper(s, i, i+1, n);
			}
			return res;
	    }
		
		public void helper(String s, int i, int j, int n) {
			while(i >= 0 && j < n && s.charAt(i) == s.charAt(j)) {
				res++;
				i--;
				j++;
			}
		}
}
