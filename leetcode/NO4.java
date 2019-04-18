package code;

public class NO4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
		int length =  length1+length2;
		int []a = new int[length];
		
		int i = 0,j =0,k=0;
		double res = 0;
		while(i<length1 && j<length2){
			if(nums1[i]<nums2[j]){
				a[k++] = nums1[i];
				i++;
			}else{
				a[k++] = nums2[j];
				j++;
			}
		}
		while(i<length1){
			a[k++] = nums1[i];
			i++;
		}
		while(j<length2){
			a[k++] = nums2[j];
			j++;
		}
		
		if(a.length%2==0 ){
			res = (a[length/2]+a[length/2-1])/2.0; 
		}else{
			res = a[length/2]+0.0;
		}
		return res;
	}

}
