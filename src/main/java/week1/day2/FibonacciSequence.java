package week1.day2;

public class FibonacciSequence {

	public static void main(String[] args) {
		//	Method 1 - directly implementing the logic in the main method
		int range = 13;
		int previous = 0;
		int current = 1;
		int next = 0;

		for (int i = 0; i <= range - 1; ++i) {
			System.out.println(previous);
			next = previous + current;
			previous = current;
			current = next;
		}

		System.out.println("**************************************************************");
//		Method 2 - Implementing the logic through method reference and object
		FibonacciSequence fibSeq = new FibonacciSequence();
		for (int i = 0; i < range; i++) {
			System.out.println(fibSeq.fibSequence(i));

		}
	}

	public int fibSequence(int n) {

		if (n == 0) {
			return 0;
		}

		int initial = 0;
		int current = 1;
		int next = 0;

		for (int i = 1; i < n; i++) {
			next = initial + current;
			initial = current;
			current = next;
		}
		return current;
	}

}
