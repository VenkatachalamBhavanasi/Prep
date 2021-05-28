package javaconceptoftheday;

import org.junit.Test;

public class ReverseString {

	@Test
	public void example() {

		String string = "MyJava";

		tryWithStringBuffer(string);
		tryWithString(string);
		tryRecursiveMethod(string);

	}

	private void tryRecursiveMethod(String string) {
		// TODO Auto-generated method stub

		System.out.println(recursiveMethod(string));

	}
	int j = 0;
	private String recursiveMethod(String string) {
		// TODO Auto-generated method stub

		if (string == null || string.length() <= 1 || j == string.length() - 1) {
			return string;

		}
		j++;

		/*
		 * System.out.println(string.substring(1));
		 * System.out.println(string.charAt(0)); System.out.println(string.substring(1)
		 * + string.charAt(0));
		 */

		return recursiveMethod(string.substring(1) + string.charAt(0));
	}

	private void tryWithString(String string) {
		// TODO Auto-generated method stub
		String reverseString = "";
		char[] charArray = string.toLowerCase().toCharArray();
		for (int i = charArray.length - 1; i > 0; i--) {
			reverseString = reverseString + charArray[i];
		}
		System.out.println("Reverse String  " + reverseString);
	}

	private void tryWithStringBuffer(String string) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer(string);
		sb.reverse();

		System.out.println("Reversed String   " + sb);

	}

}
