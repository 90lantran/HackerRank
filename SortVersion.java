import java.util.Arrays;
import java.util.Comparator;


public class SortVersion {
	public static void main(String[] args){
		String[] arr = {"1.1.4.5.6", "12.0","1.1.5","4.8","1.23","3.8.1","12.2.3","3.1.6.7"};
		Arrays.sort(arr, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				String[] arr1 = o1.split("\\.");
				String[] arr2 = o2.split("\\.");
				int minL = Math.min(arr1.length, arr2.length);
				for(int i = 0; i < minL; i++){
					if (Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
						return 1;
					} else if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
						return -1;
					}
				}
				
				if (minL == arr1.length) {
					return -1;
				} else if (minL == arr2.length){
					return 1;
				}
				 return 0;
			}
			
		});
		
		for(String s: arr){
			System.out.println(s);
		}
	}
}
