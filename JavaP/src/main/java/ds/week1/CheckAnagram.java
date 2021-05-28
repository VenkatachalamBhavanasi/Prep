package ds.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CheckAnagram {
	/*
	 * 1) Write a function to check whether two given strings are anagram of each
	 * other or not. An anagram of a string is another string that contains the same
	 * characters, only the order of characters can be different. For example,
	 * �abcd� and �dabc� are an anagram of each other.
	 */
	@Test
	public void example1() {
		String s1 = "listen";
		String s2 = "silent";
		boolean anagram = isAnagram(s1, s2);
		System.out.println(anagram);
		Assert.assertEquals(true, anagram);
	}

	@Test
	public void example2() {
		String s1 = "Listen ";
		String s2 = "Silent ";
		boolean anagram = isAnagram(s1, s2);
		System.out.println(anagram);
		Assert.assertEquals(false, anagram);
	}

	@Test
	public void example3() {
		String s1 = "ABCD";
		String s2 = "CBA";
		boolean anagram = isAnagram(s1, s2);
		System.out.println(anagram);
		Assert.assertEquals(false, anagram);
	}

	@Test
	public void example4() {
		String s1 = "AABB";
		String s2 = "AAAB";
		boolean anagram = isAnagram(s1, s2);
		System.out.println(anagram);
		Assert.assertEquals(false, anagram);
	}

	/*
	 * //Psedocode
	 *
	 * 1) if the length is not same, retun false 2)convert string to char[] 3) push
	 * char[] to list 4)and compare both
	 *
	 *
	 */

	private boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() != s2.length())
			return false;

		List<Character> l1 = new ArrayList<Character>();
		List<Character> l2 = new ArrayList<Character>();
		for (int i = 0; i < s1.length(); i++) {
			l1.add(s1.charAt(i));
			l2.add(s2.charAt(i));

		}
		Collections.sort(l1);
		Collections.sort(l2);
		if (l1.equals(l2)) {
			return true;

		}

		return false;
	}

}
