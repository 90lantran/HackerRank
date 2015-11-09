import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencySort {

	static void sortByFrequency(int[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		Map<Integer, Integer> sortedMap = sortByValue(map);
		
		for(int i = 0; i < arr.length; i ++){
			
		}
		int index = 0;
		for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()){
			int temp = entry.getValue();
			while (temp > 0){
				arr[index++] = entry.getKey();
				temp--;
			}
		}
		
		//return arr;
	}

	static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(
			Map<K, V> map) {
		List<Map.Entry<K, V>> list = new ArrayList<Map.Entry<K, V>>(
				map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {

			@Override
			public int compare(Entry<K, V> o1, Entry<K, V> o2) {
				int temp = o2.getValue().compareTo(o1.getValue());
				
				if (temp == 0){
					// throw exception
					System.out.println("Same frequency");
				}
			
					return temp;
				
					
				
			}

		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;

	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8, 4, 5, 4, 5 };
		
		sortByFrequency(arr);
		
		for (int x : arr){
			System.out.print( x + " ");
		}
	}
}
