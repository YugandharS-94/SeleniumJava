package week3.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListIntersect {

	public static void main(String[] args) {
		List<Integer> intList1 = new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		List<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));
		Collections.sort(intList1);
		Collections.sort(intList2);

		for (int i = 0; i < intList1.size(); i++) {

			for (int j = 0; j < intList2.size(); j++) {

				if (intList1.get(i) == intList2.get(j)) {
					System.out.println("Both the lists are intersecting at : " + intList1.get(i));
				}
			}
		}

	}

}
