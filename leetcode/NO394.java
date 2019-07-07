package code;

import java.util.Stack;

public class NO394 {
	
	public static void main(String[] args) {
		System.out.println(new NO394().decodeString("3[a2[bc]]"));
	}
	
	public String decodeString(String s) {
        String res = "";
        StringBuffer sb = new StringBuffer();
        
        Stack<Integer> stack_num = new Stack<Integer>();
        Stack<String> stack_str = new Stack<String>();
        
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	
        	//不仅仅是个位数
        	if(c >= '0' && c <= '9') {
        		int num = 0;
        		while(c >= '0' && c <= '9') {
        			num = num * 10 + (c-'0');
        			i++;
        			c = s.charAt(i);
        		}
        		stack_num.push(num);
        		i--;
        	}else if(c == '[') {
        		//将[之前的字符串结果入栈，并置为""
        		stack_str.push(res);
        		res = "";
        	}else if((c >= 'a' && c <= 'z') || (c >= 'A' && c < 'Z')) {
        		res = res + c;
        	}else { //c == ']'
        		sb = new StringBuffer(stack_str.pop());
        		int cnt = stack_num.pop();
        		for(int j = 1; j <= cnt; j++)
        			sb.append(res);
        		res = sb.toString();
        	} 
        	
        	
        }
        return res;
    }
}
