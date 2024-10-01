package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		
		int[] numbers={2, 5, 7, 7, 5, 9, 2, 3};
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i+1; j < numbers.length; j++) {

				if (numbers[i]==numbers[j]) {
					System.out.println("First loop for Duplicate numbersber: "+ numbers[i]);
				}
				
			}
			
		}
		
		System.out.println("========================================");
		
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length-1 ; i++) {
			
			if (numbers[i]==numbers[i+1]) {
			System.out.println("Second loop for Duplicate numbersber: "+ numbers[i]);
				
			}
			
		}
	}
}
