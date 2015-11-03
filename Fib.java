
public class Fib {
	private static double getNth(double n){
		double c = 1/ Math.sqrt(5.0);
		double a = (1+ Math.sqrt(5.0))/2.0;
		double b = (1- Math.sqrt(5.0))/2.0;
		//return c*((Math.pow(a, n)) - (Math.pow(b, n)));
		return 1.0/ Math.sqrt(5.0)*((Math.pow(a, n))) - 1.0/ Math.sqrt(5.0)*((Math.pow(b, n)));
		//return Math.floor(1.0/ Math.sqrt(5.0)*((Math.pow(a, n))));
	}
	
	public static void main(String[] args){
		System.out.println(getNth(12));
	}
}
