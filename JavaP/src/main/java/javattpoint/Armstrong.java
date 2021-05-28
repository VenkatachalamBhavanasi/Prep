package javattpoint;

import org.junit.Test;

public class Armstrong {

	@Test

	public void example() {

		int number = 153;

		armstrongOfNumber(number);

	}

	private void armstrongOfNumber(int number) {
		// TODO Auto-generated method stub

		int sum = 0, rem = 0;

		while (number > 0) {
			rem = number % 10;
			sum = sum + rem * rem * rem;
			number = number / 10;

		}

		System.out.println(sum);

	}

}
