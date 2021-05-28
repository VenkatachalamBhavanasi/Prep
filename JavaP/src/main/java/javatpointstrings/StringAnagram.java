package javatpointstrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class StringAnagram {

	@Test
	public void example() {

		String str1 = "Brag";
		String str2 = "Grab";

		anagram(str1, str2);

	}

	@Test
	public void example1() {

		String str1 = "Bragg";
		String str2 = "Grabb";

		anagram(str1, str2);

	}

	private void anagram(String str1, String str2) {
		// TODO Auto-generated method stub
		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();
		for (int i = 0; i < charArray1.length; i++) {
			list1.add(charArray1[i]);
			list2.add(charArray2[i]);

		}

		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1 + " " + list2);

		if (list1.equals(list2)) {
			System.out.println("strings are equal");

		} else {
			System.out.println("strings are not equal");

		}

	}

	private void anagram1(String str1, String str2) {
		// TODO Auto-generated method stub

		str1 = str1.toLowerCase();
		str1 = str2.toLowerCase();

		if (str1.length() != str2.length())
			System.out.println("Both the strings are not anagram");

		if (str1.equals(str2))
			System.out.println("strings are equal");

		else {
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str2.length(); j++) {
					if (str1.charAt(i) != str2.charAt(j)) {

						break;

					}

				}
				System.out.println("Both the strings are not anagram");

			}

		}

	}

}
