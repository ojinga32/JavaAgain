package CodingTest;

public class NumberUtils {
	
	public static int getLastDigit(int number) {
		if(number < 0) return -1;
		
		
		return number % 10;
	}
			
	public static void main(String[] args) {
		System.out.println(getLastDigit(328));;
	}
}
