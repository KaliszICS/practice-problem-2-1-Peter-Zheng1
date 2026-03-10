public class PracticeProblem {

	public static void main(String args[]) {

	}

	//Create your functions here
	public static int sum(int num1, int num2){
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static int difference(int num1, int num2){
		int result;
		result = num1 - num2;
		return result;
		
	}

	public static double product(double num1, double num2){
		double result;
		result = num1 * num2;
		return result;

	}

	public static String removeFirst(String wordy){
		String newword;
		newword = wordy.substring(1);
		return newword;

	}
}
