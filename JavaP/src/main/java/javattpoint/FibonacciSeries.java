package javattpoint;

import org.junit.Test;

public class FibonacciSeries {

	/*
	 * In fibonacci series, next number is the sum of previous two numbers for
	 * example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of
	 * fibonacci series are 0 and 1.
	 */

	@Test

	public void example() {

		int firstNumber = 0, secondNumber = 1, count = 10;

		fibonacciSeries(firstNumber, secondNumber, count);

	}

	private void fibonacciSeries(int firstNumber, int secondNumber, int count) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 2; i < count; i++) {
			sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			System.out.println(sum);

		}

	}

}
