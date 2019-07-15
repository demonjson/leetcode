package code;

public class NO2 {


	//
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	     StringBuffer sb1 = new StringBuffer();
	     while(l1!=null){
	    	 sb1.append(l1.val);
	    	 l1 = l1.next;
	     }
	     StringBuffer sb2 = new StringBuffer();
	     while(l2!=null){
	    	 sb2.append(l2.val);
	    	 l2 = l2.next;
	     }
	     
	     int length = 0;
	     int length1 = sb1.length();
	     int length2 = sb2.length();
	     if(length1>=length2){
	    	 length = length1;
	    	 for(int i = 1;i<=length1-length2;i++)
	    			 sb2.append("0");
	     }else{
	    	 length = length2;
	    	 for(int i = 1;i<=length2-length1;i++)
	    			 sb1.append("0");
	     }
	     
	     StringBuffer s = new StringBuffer();
	     int cnt = 0;
	     for(int i = 0;i<length;i++){
	    	 int c1 = Integer.parseInt(String.valueOf(sb1.charAt(i)));
	    	 int c2 = Integer.parseInt(String.valueOf(sb2.charAt(i)));
	    	 int c = c1 + c2 + cnt;
	    	 cnt = 0;
	    	 if(c >=10){
	    		 c-=10;
	    		 cnt = 1;
	    	 }
	    	 s.append(c);
	     }
	     
	     if(cnt > 0)
	    	 s.append(cnt);
	     s = s.reverse();
	     ListNode l3 = new ListNode(1);
	     for(int i = 0;i<s.length();i++){
	    	 char c = s.charAt(i);
	    	 int f = Integer.parseInt(String.valueOf(c));
	    	 ListNode t = new ListNode(f);
	    	 t.next = l3.next;
	    	 l3.next = t;
	     }
	     
	     return l3.next;
	}
}
