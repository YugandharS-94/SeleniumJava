package week3.assignment;

public class OddNumberIndexToUpperCase {

	private static void oddToUpperCas(String input) {

		char[] inputArr = input.toCharArray();

		for (int i = 0; i < inputArr.length; i++) {
			if (i % 2 != 0) {

				System.out.print(Character.toUpperCase(inputArr[i]));
			} else {
				System.out.print(inputArr[i]);
			}
		}
	}

	public static void main(String[] args) {
		oddToUpperCas("changeme");
	}

}
