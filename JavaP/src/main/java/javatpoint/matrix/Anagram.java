package javatpoint.matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Anagram {

	@Test
	public void example() {

		String s1 = "listen";
		String s2 = "silent";
		anagram(s1, s2);

	}

	@Test
	public void example1() {

		String s1 = "Lis ten";
		String s2 = "Sil ent";
		anagram(s1, s2);

	}

	@Test
	public void example2() {

		String s1 = "ABCD";
		String s2 = "CBA";
		anagram(s1, s2);

	}

	private void anagram(String s1, String s2) {
		// TODO Auto-generated method stub

		if (s1.length() != s2.length()) {
			throw new RuntimeException("invalid input");

		}
		char[] charArray = s1.toCharArray();

		char[] charArray2 = s2.toCharArray();

		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();

		for (int i = 0; i < charArray.length; i++) {

			list1.add(charArray[i]);
			list1.add(charArray2[i]);
		}

		if (list1.containsAll(list2)) {
			System.out.println(true);

		} else
			System.out.println(false);

	}

	private void anagram1(String s1, String s2) {
		// TODO Auto-generated method stub

		if (s1.length() != s2.length()) {
			throw new RuntimeException("invalid input");

		}
		List<Character> list1 = new ArrayList<>();
		List<Character> list2 = new ArrayList<>();

		for (int i = 0; i < s2.length(); i++) {

			list1.add(s1.charAt(i));
			list2.add(s1.charAt(i));

		}

		Collections.sort(list1);
		Collections.sort(list2);




	}

}
