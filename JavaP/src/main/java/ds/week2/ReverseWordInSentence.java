package ds.week2;

import org.junit.Test;

public class ReverseWordInSentence {

	/*
	 * Given a string, you need to reverse the order of characters in each word
	 * within a sentence while still preserving whitespace and initial word order.
	 * Input: "I am doing great" Output: "I ma gniod taerg"
	 */

	@Test
	public void example1() {
		String input = "I am doing great";
		System.out.println(reverseWordsInLine(input));
	}

	@Test
	public void example2() {
		String input = "Testing";
		System.out.println(reverseWordsInLine(input));
	}

	@Test
	public void example3() {
		String input = "";
		System.out.println(reverseWordsInLine(input));
	}

	private String reverseWordsInLine(String input) {
		// TODO Auto-generated method stub
		if (input.length() == 0)
			return input;

		String[] split = input.split(" ");
		String output = "";

		for (String str : split) {
			if (str.length() == 1)
				output += str + " ";
			else {
				char[] charArray = str.toCharArray();
				int left = 0, right = charArray.length - 1;
				while (left < right) {
					char temp = charArray[left];
					charArray[left++] = charArray[right];
					charArray[right--] = temp;

				}
				output += String.valueOf(charArray) + " ";

			}

		}

		return output;
	}

	private String reverseWordsInLineBruteForce(String input) {
		// TODO Auto-generated method stub

		if (input.length() == 0)
			return input;

		String[] words = input.split(" ");
		String reversedString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);

			}
			reversedString = reversedString + reverseWord + " ";
		}

		System.out.println(reversedString);

		return reversedString;
	}

}
