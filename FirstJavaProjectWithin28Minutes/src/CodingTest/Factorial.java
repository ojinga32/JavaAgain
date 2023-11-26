package CodingTest;

public class Factorial {

	public static int factorial(int inputNumber) {
		
		int number = 1;
		for(int i = 1; i <= inputNumber; i++) {
			number = number * i;
		}
		return number;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(10));
	}

}
