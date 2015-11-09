import java.util.Stack;

public class EvaluateReverse {

	static int evaluate(String[] arr) {
		Stack<String> s = new Stack<String>();
		// int op = Integer.parseInt(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			// if (arr[i].equals("*") || arr[i].equals("+") ||
			// arr[i].equals("/") || arr[i].equals("-")){
			//
			// int op2 = Integer.parseInt(s.pop());
			// int op1 = Integer.parseInt(s.pop());
			// s.push(item);
			//
			// }

			switch (arr[i]) {
			case "+":
				int op2 = Integer.parseInt(s.pop());
				int op1 = Integer.parseInt(s.pop());
				s.push((op1 + op2) + "");
				break;
			case "-":
				int op4 = Integer.parseInt(s.pop());
				int op3 = Integer.parseInt(s.pop());
				s.push((op3 - op4) + "");
				break;
			case "*":
				int op6 = Integer.parseInt(s.pop());
				int op5 = Integer.parseInt(s.pop());
				s.push((op5 * op6) + "");
				break;
			case "/":
				int op8 = Integer.parseInt(s.pop());
				int op7 = Integer.parseInt(s.pop());
				s.push((op7 / op8) + "");
				break;
			default:
				s.push(arr[i]);

			}

		}
		
		return Integer.parseInt(s.pop());
	}

	public static void main(String[] args) {
		String[] input = { "4", "13", "5", "/", "+"};
		System.out.println(evaluate(input));
	}
}
