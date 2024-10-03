package week3.assignment;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";

		String[] splitText = text.split(" ");

		int count = 0;
		for (int i = 0; i < splitText.length; i++) {
			for (int j = i + 1; j < splitText.length; j++) {
				if (splitText[i].equalsIgnoreCase(splitText[j]) && !splitText[i].equals("")) {
					splitText[j] = "";
					count++;
				}
			}
		}
		if (count > 1) {
			System.out.println("Modified string is: ");
			for (int i = 0; i < splitText.length; i++) {
				System.out.print(splitText[i] + " ");
			}
		} else {
			System.out.println("No duplicate words found");
		}
	}
}
