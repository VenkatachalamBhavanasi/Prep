package javattpoint;

import org.junit.Test;

public class Palindrome {

	@Test
	public void example() {
		int number = 121;
		palindrome(number);

	}

	private void palindrome(int number) {
		// TODO Auto-generated method stub
		int rem = 0, sum = 0;
		int temp = number;

		while (number > 0) {

			rem = number % 10;
			sum = sum * 10 + rem;
			number = number / 10;

		}

		if (temp == sum) {
			System.out.println("given number is palindrome");

		}

	}

}
