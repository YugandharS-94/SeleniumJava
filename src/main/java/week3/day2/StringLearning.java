package week3.day2;

public class StringLearning {

	public static void main(String[] args) {
		/*
		 * String value="Selenium Java"; replace-(e,E) replaceAll("[a-z]","0"); String
		 * amt = "5645"; convert into int
		 */
		System.out.println("");
		String value = "Selenium Java";

		String replaceE = value.replace('e', 'E');
		System.out.println(replaceE);

		String replaceAll = value.replaceAll("[a-z]", "0");
		System.out.println(replaceAll);

		String amt = "5645";
		int parsedInt = Integer.parseInt(amt);
		System.out.println(parsedInt);

	}

}
