/*
 *  Reverse word in a sentence EX: hello world 3 -> 3 world hello
 */
public class ReverseWord {
	
	static void reverse(String[] arr){
		
		for (int i = 0 ; i < arr.length/2; i ++){
			String temp = arr[i];
			arr[i] = arr[arr.length - i -1];
			arr[arr.length - i -1] = temp;
		}
		
		//return null;
	}
	public static void main(String[] args){
		String sentence = "hello world 3";
		String[] tokens = sentence.split(" ");
		
		reverse(tokens);
		
		for (int i = 0; i < tokens.length; i++){
			System.out.print(tokens[i] + " ");
		}
	}
}
