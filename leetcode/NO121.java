package code;

public class NO121 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {
		if(prices == null || prices.length < 2)
			return 0;
		
		int min = prices[0];
		int max = 0;
		
		for(int i = 1; i<prices.length; i++){
			if(prices[i] - min > max)
				max = prices[i] - min;
			
			if(min > prices[i])
				min = prices[i];
		}
		return max;
	}
}
