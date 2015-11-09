import java.util.HashMap;
import java.util.Map;


public class Fib {
	private static double getNth(double n){
		double c = 1/ Math.sqrt(5.0);
		double a = (1+ Math.sqrt(5.0))/2.0;
		double b = (1- Math.sqrt(5.0))/2.0;
		//return c*((Math.pow(a, n)) - (Math.pow(b, n)));
		return 1.0/ Math.sqrt(5.0)*((Math.pow(a, n))) - 1.0/ Math.sqrt(5.0)*((Math.pow(b, n)));
		//return Math.floor(1.0/ Math.sqrt(5.0)*((Math.pow(a, n))));
	}

	
	static int fibNth(int n, Map<Integer, Integer> map){
		int current = 0;
		
		if (map.containsKey(n)){
			return map.get(n);
		}
		if ( n < 2){
			current = 1;
		} else {
		  current = fibNth(n-2, map) + fibNth(n-1,map);
		}
		map.put(n, current);
		
		return current;
		
	}
	
	
	public static void main(String[] args){
		System.out.println(getNth(12));
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println(fibNth(11,map));
	}
}
