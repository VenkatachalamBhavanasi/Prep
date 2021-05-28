package ds.week1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FindUnique {

	/*
	 * Find unique characters in a given string. Input: Testleaf Output: a, s, f, l
	 */
	 @Test // Positive
	public void example1() {
		String s1 = "Testleaf";
		char[] output = { 's', 'l', 'a', 'f' };
		getUnique(s1);
		// Assert.assertEquals(unique, output);
	}

	@Test // Edge
	public void example2() {
		String s1 = " Babu $#$ ";
		char[] output = { 'a', 'u', '#' };
		getUnique(s1);

	}

	@Test // Negative
	public void example3() {
		String s1 = "aaaa";
		char[] output = {};
		getUnique(s1);
	}

	@Test
	public void example4() {
		String s1 = "abc";
		char[] output = { 'a', 'b', 'c' };
		getUnique(s1);
	}

	/*
	 * psudoCode
	 *
	 * 1) Take the string, convert to lowercase and convert to character array !!
	 * 2)Create a set 3) Iterate from left to right a) Check if the given character
	 * is already in the set -> (yes) remove it b) Not in the set -> add it !! 3)
	 * Finally print or send it back !!
	 *
	 */

	private void getUnique(String s1) {
		// TODO Auto-generated method stub

		char[] charArray = s1.toLowerCase().toCharArray();

		Set<Character> unique = new HashSet<>();
		Set<Character> dups = new HashSet<>();
		for (Character character : charArray) {
			if (unique.contains(character) || dups.contains(character)) {
				unique.remove(character);
				dups.add(character);

			}
			else
				unique.add(character);

		}
		System.out.println(unique);

	}

}
