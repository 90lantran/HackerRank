
public class Pow2 {
	
	static boolean isPow2(int x){
		if (x == 1) return true;
		if (x % 2 == 1) return false;
		return isPow2(x/2);
	}
	public static void main(String[] args){
		System.out.println(isPow2(16));
	}
}
