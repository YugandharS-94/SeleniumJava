package javachallenges;

public class StringChallenges {

	public static void main(String[] args) {

		String input = "  fly me   to   the moon  ";
		
		// saving the split value to array
		String[] splitInput = input.split(" ");
		
		// Saving the last word from array to string
		String lastWord = splitInput[splitInput.length - 1];

		System.out.println("The last word is " + lastWord + " with length " + lastWord.length());

	}

}
