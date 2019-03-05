package code;

public class NO20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isNumeric(char[] str) {
		boolean sign = false,decimal = false, haseE = false;
		for(int i = 0; i < str.length; i++){
			if(str[i] == 'e' || str[i]=='E'){
				if(i == str.length-1) return false;
				//不能同时存在两个E
				if(haseE) return false;
				haseE = true;
			}else if(str[i]=='+' || str[i]=='-'){
				//+,-第二次出现,前面的必须是e
				if(sign && str[i-1]!='e' && str[i-1]!='E') return false;
				//第一次出现，并且不是出现开头，前面的必须是e
				if(!sign && i>0 && str[i-1]!='e' && str[i-1]!='E') return false;
				sign = true;
			}else if(str[i]=='.'){
				//.小数点必须出现在E的后面，并且不能重复出现
				if(haseE || decimal)return false;
				decimal = true;
			}else if(str[i]<'0' || str[i]>'9'){
				return false;
			}
		}
		return true;
    }
}
