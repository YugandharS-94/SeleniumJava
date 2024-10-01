package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		int input = 1210;
		int num = input;
		int output = 0;

		for (int i = num; i > 0; i /= 10) {

			output = output * 10 + num % 10;
			num /= 10;
		}

		if (input == output) {

			System.out.println(input + " is a palindrome number");

		} else {
			System.out.println(input + " is not a palindrome number");
		}

	}

}
