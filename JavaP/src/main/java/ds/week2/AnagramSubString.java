package ds.week2;

import org.junit.Test;

public class AnagramSubString {

	/*
	Find if the given anagram is substring of the input string. Solve using sliding window.
	Example 1:
	String input="acbbabccaabcab";
	String anagram="abc";
	Output: True
	Explanation: Substring(0,2) is anagram of "abc"

	Example 2:
	String input="acbbabccaabcab";
	String anagram="abd";
	Output: false
	*/


	@Test
	public void example1() {
		String input="acbbabccaabcab";
		String anagram="abc";
		System.out.println(isAnagramAvailable(input, anagram));

	}

	@Test
	public void example2() {
		String input="acbbabccaabcab";
		String anagram="abd";
		System.out.println(isAnagramAvailable(input, anagram));

	}

	@Test
	public void example3() {
		String input="abfgkcedel";
		String anagram="eecd";
		System.out.println(isAnagramAvailable(input, anagram));

	}

	private Object isAnagramAvailable(String input, String anagram) {
		// TODO Auto-generated method stub



		return null;
	}

}
