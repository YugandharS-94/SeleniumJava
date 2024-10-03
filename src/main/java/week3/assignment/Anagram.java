package week3.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "boat";
		String s2 = "toaba";
		
		if (s1.length() == s2.length()) {
			char[] charArr1 = s1.toCharArray();
			Arrays.sort(charArr1);
			char[] charArr2 = s2.toCharArray();
			Arrays.sort(charArr2);

			if (Arrays.equals(charArr1, charArr2)) {
				System.out.println("Given strings are Anagram");
			} else {
				System.out.println("Given strings are not Anagram");
			}

		} else {
			System.out.println("Given strings are not Anagram");
		}

	}

}
