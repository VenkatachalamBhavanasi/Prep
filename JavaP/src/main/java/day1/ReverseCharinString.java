package day1;

import org.junit.Test;

public class ReverseCharinString {

	@Test
	public void example() {
		String str = "Could we help you";
		reverseCharString(str);
	}

	private void reverseCharString(String str) {
		// TODO Auto-generated method stub

		String[] split = str.split(" ");
		String reverseString = "";

		for (int i = 0; i < split.length; i++) {

			String word = split[i];
			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord=reverseWord+word.charAt(j);


			}

			reverseString=reverseString+" "+reverseWord;

		}

		System.out.println(reverseString);

	}

}
