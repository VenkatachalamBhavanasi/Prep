package ds.week1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingChar {
	/*
	 * Longest substring without repeating characters Input: s="abcabcbb" Output: 3
	 * Explanation: The answer is "abc", with the length of 3 Input: s="bbbbb"
	 * Output: 1 Explanation: The aswer is "b", with the length of 1 Input:
	 * s="pwwkew" Output: 3 Explanation: The answer is "wke", with the length of 3
	 * Notice that the answer must be a substring, "pwke" is a subsequence not a
	 * substring.
	 */
	@Test
	public void example1() {
		String input = "abcabcbb";
		System.out.println(returnMaxSubstringLength(input));
	}

	@Test
	public void example2() {
		String input = "bbbbb";
		System.out.println(returnMaxSubstringLength(input));
	}

	@Test
	public void example3() {
		String input = "pwwkew";
		System.out.println(returnMaxSubstringLength(input));
	}

	@Test
	public void example4() {
		String input = "";
		System.out.println(returnMaxSubstringLength(input));
	}

	/*
	 * //psudoCode convert string to char array iterate over chararray and try to
	 * push values to a list or set. get count and values.
	 *
	 *
	 */
	private int returnMaxSubstringLength(String input) {
		// TODO Auto-generated method stub
		if (input.length() == 0) {
			return 0;

		}
		int maxLength = -1;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < input.length(); j++) {

				if (!set.add(input.charAt(j))) {
					maxLength = Math.max(maxLength, j - i);
					System.out.println(set);
					break;

				}

			}
			set.clear();

		}

		return maxLength;
	}

}
