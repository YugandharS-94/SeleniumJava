package week1.day2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] element = {1,4,3,2,8,6,7};
			Arrays.sort(element);

		for (int i = 1; i <= element.length; i++) {
			if (element[i-1] != i) {
				System.out.println(i);
				break;
			}
			
		}
	}

}
