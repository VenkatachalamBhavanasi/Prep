package javatpoint.matrix;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubString {

	@Test
	public void example() {
		String input = "";
		longestSubString(input);

	}

	private void longestSubString(String input) {
		// TODO Auto-generated method stub
		int maxLength = -1;
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < input.length(); i++) {

			for (int j = i; j < input.length(); j++) {

				if (!set.add(input.charAt(j))) {

					maxLength = Math.max(maxLength, j - i);
					break;

				}

			}

			set.clear();

		}

		System.out.println(maxLength);

	}

}
