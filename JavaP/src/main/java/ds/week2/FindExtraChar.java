package ds.week2;

import java.util.Arrays;

import org.junit.Test;

public class FindExtraChar {

	/*
	 * Given 2 string with length n and n+1 respectively. the second string contains
	 * all the character of first but with an extra char. write the code to find the
	 * extra char.
	 *
	 * Example 1: Input: A1="Test" A2="Test$" Output: '$'
	 *
	 * Example 2: Input: A1="Hello" A2="lloreH" Output: 'r'
	 */

	@Test
	public void example1() {
		String a1 = "Test";
		String a2 = "Test$";
		System.out.println(findExtraChar(a1, a2));
	}

	@Test
	public void example2() {
		String a1 = "Hello";
		String a2 = "lloreH";
		System.out.println(findExtraChar(a1, a2));
	}

	private char findExtraChar(String a1, String a2) {
		// TODO Auto-generated method stub
		char[] charArray1 = a1.toCharArray();
		char[] charArray2 = a2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		int p1 = 0, p2 = 0;

		while (p1 < charArray1.length && p2 < charArray2.length) {
			if (charArray1[p1] != charArray2[p2]) {
				return charArray2[p2];

			}
			p1++;
			p2++;

		}

		return charArray2[p2];
	}

}
