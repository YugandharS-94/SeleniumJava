package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {

		int primeNum = 11;
		if (isPrime(primeNum)) {
			System.out.println(primeNum + " is a prime number");
		} else {
			System.out.println(primeNum + " is not a prime number");
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n-1; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

}
