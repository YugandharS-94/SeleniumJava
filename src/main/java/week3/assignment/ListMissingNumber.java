package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMissingNumber {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 10, 6, 8 };
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			numList.add(num[i]);
		}

		Collections.sort(numList);

		for (int i = 1; i < numList.size(); i++) {

			if (numList.get(i - 1) != i) {
				System.out.println("Missing number is: " + i);
				break;
			}
		}
	}

}
