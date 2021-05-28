package ds.week2;

import org.junit.Test;

public class ReverseVowels {

	/*
	 * Reverse only vowels in string Babu -> Buba
	 */

	@Test
	public void example1() {
		String str = "Babu";
		// Buba
		System.out.println(reverseVowelsOnly(str));
	}

	@Test
	public void example2() {
		String str = "winnerofcode";
		// wennorofcedi
		System.out.println(reverseVowelsOnly(str));

	}

	@Test
	public void example3() {
		String str = "hllyrt";
		// wennorofcedi
		System.out.println(reverseVowelsOnly(str));

	}

	@Test
	public void example4() {
		String str = "hlllloei";
		// wennorofcedi
		System.out.println(reverseVowelsOnly(str));

	}

	private String reverseVowelsOnly(String str) {
		// TODO Auto-generated method stub

		if (str.length() < 2) {
			return str;

		}

		char[] charArray = str.toCharArray();
		int left = 0, right = str.length() - 1;
		while (left < right) {
			if (isVowel(charArray[left]) && isVowel(charArray[right])) {

				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;


			} else if (!isVowel(charArray[left])) {
				left++;

			} else if (!isVowel(charArray[right])) {
				right++;

			}

		}
		return new String(charArray);

	}

	private boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;

	}
}
