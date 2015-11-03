public class MergeSort {

	static int[] mergeSort(int[] arr) {
		return helper(arr, 0, arr.length - 1);
	}

	static int[] helper(int[] arr, int start, int end) {

		if (start >= end) { // only 1 elements
			return new int[] { arr[start] };
		} else {

			int middle = (end + start) / 2;
			int[] left = helper(arr, start, middle);
			int[] right = helper(arr, middle + 1, end);

			return merge(left, right);
		}
	}

	static int[] merge(int[] arr1, int[] arr2) {
		int l1 = arr1.length;
		int l2 = arr2.length;
		int[] result = new int[l1 + l2];
		int index = 0;
		int i = 0;
		int j = 0;
		int flag = 0;

		for (; index < l1 + l2; index++) {
			if (arr1[i] > arr2[j]) {
				result[index] = arr2[j++];
				//j++;
				if ( j == arr2.length) { flag = 1; break;}
			} else { // arr1[i] < arr2[j]
				result[index] = arr1[i++];
				//i++;
				if (i == arr1.length) { flag = 2;break;}
			}
			
			
		}
		if (flag == 2){
			// copy the rest of 2 to result
			for (int temp = j ; temp < arr2.length; temp++){
				//index++;
				result[++index] = arr2[temp];
			}
		}
		if (flag == 1){// copy the rest of 1 to result
			for(int temp = i; temp < arr1.length ; temp ++){
				//index++;
				result[++index] = arr1[temp];
			}
		}
		
		

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 99,7, 5, 4 ,6 ,24, 56,1};
		int[] result = mergeSort(arr);

		for (int x : result) {
			System.out.println(x);
		}

	}
}
