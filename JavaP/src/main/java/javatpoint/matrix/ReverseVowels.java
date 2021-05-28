package javatpoint.matrix;

import org.junit.Test;

public class ReverseVowels {

	@Test
	public void example() {

		String str = "winnerofcode";

		System.out.println(reverseVowelsOnly(str));



	}

	private String reverseVowelsOnly(String str) {
		// TODO Auto-generated method stub

		char[] charArray = str.toLowerCase().toCharArray();
		int left = 0, right = str.length() - 1;

		while (left <= right) {

			if (isVowel(charArray[left]) && isVowel(charArray[left])) {

				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;

				right--;
				left++;

			} else if (!isVowel(charArray[left])) {

				left++;

			} else if (!isVowel(charArray[right])) {
				right--;

			}

		}
		return String.valueOf(charArray);

	}

	private boolean isVowel(char c) {

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;

		}

		return false;

	}

}
