package javattpoint;

import org.junit.Test;

public class Factorial {
	@Test
	public void example() {
		int number = 5;
		factorialOfNumber(number);

	}

	private void factorialOfNumber(int number) {
		int fact = 1;
		// TODO Auto-generated method stub
		for (int i = 1; i <= number; i++) {

			fact = fact * i;

		}
		System.out.println(fact);

	}

}
