import java.util.Arrays;
import java.util.Comparator;


public class SortVersion {
	public static void main(String[] args){
		String[] arr = {"1.1.4.5.6", "9.0","1.1.5","4.8","1.23","3.8.1","9.2.3","3.1.6.7"};
		Arrays.sort(arr, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		for(String s: arr){
			System.out.println(s);
		}
	}
}
