package code;

public class NO771 {
	public int numJewelsInStones(String J, String S) {
		int res = 0;
		for(int i = 0; i < S.length(); i++) {
			String str = Character.toString(S.charAt(i));
			if(J.contains(str))
				res++;
		}
		return res;
    }
}
