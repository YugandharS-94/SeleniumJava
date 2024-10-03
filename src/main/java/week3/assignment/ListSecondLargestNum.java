package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondLargestNum {

	public static void main(String[] args) {

		int[] num = { 3, 2, 11, 4, 6, 7 };

		List<Integer> arrList = new ArrayList<Integer>();

		for (int i = 0; i < num.length; i++) {

			arrList.add(i, num[i]);

		}

		Collections.sort(arrList);

		System.out.println("Second largest number from the list is: " +arrList.get(arrList.size() - 2));

	}

}
