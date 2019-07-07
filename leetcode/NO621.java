package code;

public class NO621 {
	/*
	 * 先要找到最大的任务个数x，若总任务类数>=n,则时间至少为(x-1)*（n+1）+最大值类数；
	 * 但是对于特殊情况：4A3B3C3D，n=2，则使用原来的思路(先放最多类的，再按照类别从前往后填空) 不能获得最小值。所以没有做出来。
	 * */
	public int leastInterval(char[] tasks, int n) {
		int[] count = new int [26];
		int max = 0, maxCount = 0;
		for(int i = 0; i < tasks.length; i++) {
			count[tasks[i]-'A']++;
		}
		for(int i = 0; i < 26; i++) {
			if(count[i] > max){
				max = count[i];
				maxCount = 1;
			}else if(count[i] == max) {
				maxCount++;
			}
		}
		return Integer.max(tasks.length, (max-1)*(n+1)+maxCount);
    }
}
