package code;

public class NO56 {

	
	public static void main(String[] args) {
		

	}
	
	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		if(array == null || array.length<2)
			return;
		int res = 0;
		for(int i = 0;i<array.length;i++){
			res ^= array[i];
		}
		int index = FindIndex(res);
		num1[0] = 0;
		num2[0] = 0;
		for(int i = 0;i<array.length;i++){
			if(isBit(array[i], index))
				num1[0] ^= array[i];
			else
				num2[0] ^= array[i];
		}
	}
	
	//寻找第一个出现1的位置
	public int FindIndex(int num){
		int index = 0;
		while((num & 1) == 0 && index<32){
			num = num >>1;
			index++;
		}
		return index;
	}

	//判断num第index是不是为1
	public boolean isBit(int num, int index){
		num = num >> index;
		return (num & 1)==1;
	}
}
