package javatpoint.matrix;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class UniqueCharacters {

	@Test
	public void texample() {

		String s1 = "Testleaf";
		char[] output = { 's', 'l', 'a', 'f' };
		getUnique(s1);

	}

	private void getUnique(String s1) {
		// TODO Auto-generated method stub
		char[] charArray = s1.toLowerCase().toCharArray();

		Set<Character> unique = new HashSet<>();
		Set<Character> duplicate = new HashSet<>();
		for (Character c : charArray) {

			if (unique.contains(c) || duplicate.contains(c)) {
				unique.remove(c);
				duplicate.add(c);

			} else {
				unique.add(c);
			}

		}
		System.out.println(unique);

	}

	/*
	 * convert to lower chars and convert it to chat array create a set travel from
	 * left to right check if the given char is already in set.(yes)- remove it. not
	 * in the set then add it.
	 *
	 * print and send set.
	 *
	 */

}
