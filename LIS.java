public class LIS {

	// Wrong answer, greedy to the next element, need DP
	static int longestSubArr1(int[] nums) {
		int l = nums.length;
		int currentMax = 0;
		int count = 1;
		for (int i = 0; i < l; i++) {
			int running = nums[i];
			for (int j = i + 1; j < l; j++) {

				if (running < nums[j]) {
					count++;
					running = nums[j];
				}
			}
			currentMax = Math.max(count, currentMax);
			count = 1;
		}
		return currentMax;
	}

	
	// DP
	static int longestSubArr(int[] nums) {
		int[] L = new int[nums.length];
		
		if (nums.length == 0) return 0;
		L[0] = 1;
		
//		for(int i = 1; i < nums.length; i++){
//			if (nums[i] <= nums[i - 1]){
//				L[i] = 1;
//			} else {
//				int oldMax = 0;
//				for(int j = 0; j < i; j++){
//					oldMax = Math.max(L[j],oldMax);
//				}
//				L[i] =  1 + oldMax;
//			}
//		}
		
		for(int i = 1; i < nums.length; i++){
			L[i] = 1;
			for(int j = 0 ;j < i; j++ ){
				if (nums[j] < nums[i]){
					L[i] = Math.max(L[i], L[j] + 1);
				}
			}
			
		}
		
		int result = 0;
		for (int k = 0; k < nums.length; k ++){
			result = Math.max(L[k], result);
		}
		return result;
		
	}

	public static void main(String[] args) {
		int[] nums1 = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int[] nums2 ={1,3,6,7,9,4,10,5,6};
		int[] nums = {2,2};
		System.out.println(longestSubArr(nums2));
	}
}
