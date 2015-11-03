
public class MaximumSubArray {
	public static void main(String[] args){
		
		int[] arr = {-3,-2,7,-3,-2,4,6,-1,3,-6,2,-3};
		
		int max = arr[0];
		int[] sum = new int[arr.length];
		
		sum[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++){
			sum[i] = Math.max(arr[i], sum[i-1] + arr[i]);
			max = Math.max(sum[i], max);
		}
		
		System.out.println(max);
	}
}
