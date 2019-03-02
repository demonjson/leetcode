package code;

public class NO33 {

	
	public static void main(String[] args) {
		

	}

	 public boolean VerifySquenceOfBST(int [] sequence) {
		 if(sequence.length == 0)
			 return false;
		 if(sequence.length == 1)
			 return true;
		 return get(sequence,0,sequence.length);
	 }
	 
	 public boolean get(int []seq,int start,int end){
		 int root = seq[end-1];
		 int i = 0;
		 for(;i<end-1;i++){
			 if(seq[i]>root)
				 break;
		 }
		 //寻找到第一个比头节点大的值（右子树的根节点）
		 int j = i;
		 for(;j<end-1;j++){
			 if(seq[j]<root)
				 return false;
		 }
		 boolean left = true;
		 if(i>0){
			 left = get(seq,0,i);
		 }
		 boolean right = true;
		 if(i<end-1){
			 right = get(seq,i,end-1);
		 }
		 return (left&&right);
	 }
	 
	 
}
