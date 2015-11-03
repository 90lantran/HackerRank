import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MakeItAnagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int commonChar = 0;
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(char c : arr1){
			if (map.containsKey(c)){
				map.put(c,map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		for (char c : arr2){
			if (map.containsKey(c)){
				commonChar++;
				map.put(c,map.get(c) -1);
				if (map.get(c)  == 0) map.remove(c);
			}
		}
		
		System.out.println(s1.length() + s2.length() - 2*commonChar);
		sc.close();
		
	}
}
