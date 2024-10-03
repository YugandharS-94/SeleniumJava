package week3.assignment;

public class ReverseOddWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		
		String[] splitTest = test.split(" ");
		
		for (int i = 0; i < splitTest.length; i++) {
			
			if (i%2 !=0) {
				char[] oddTextArr = splitTest[i].toCharArray();
				for (int j = oddTextArr.length-1 ; j >=0  ; j--) {
				 System.out.print(oddTextArr[j]);
					
				}
				System.out.print(" ");
			} else {
				System.out.print(splitTest[i] + " ");
			}
			
		}

	}

}
