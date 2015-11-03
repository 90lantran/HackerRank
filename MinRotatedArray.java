public class MinRotatedArray {
	
	static int findMin(int[] arr){
		
		return helper(arr, 0, arr.length - 1);
	
	
	}
	
	static int helper(int[] arr, int start, int end){
		
		if (start == end) return arr[start];
		
		if (end == start + 1) return Math.min(arr[start],arr[end]);
		
		int middle = (start + end )/2;
		
		if (arr[middle] < arr[start]){
			return helper(arr, start, middle);
		}
		
		//if (arr[middle] > arr[end] ){
			return helper(arr, middle, end);
		//}
		
	}
	public static void main(String[] args) {
		int[] arr ={4,5,6,7,1,2,3};
		System.out.println(findMin(arr));
		
	}
}
