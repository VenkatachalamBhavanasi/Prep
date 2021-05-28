package javattpoint;

import org.junit.Test;

public class PrimeNumber {

	@Test
	public void example() {
		int m = 35;

		// primeNumber(m);
		primeNumber1(m);

	}

	private void primeNumber(int m) {
		// TODO Auto-generated method stub
		int flag = 0;
		for (int i = 2; i < m; i++) {

			if (m % i == 0) {
				flag = 1;
				break;

			}

		}
		if (flag == 0) {
			System.out.println(m + "is prime number");

		}
		System.out.println(m + "is not prime number");

	}

	private void primeNumber1(int m) {

		for (int i = 1; i <= m; i++) {
			int count = 0;

			for (int j = 1; j <= m; j++) {

				if (i % j == 0) {
					count++;

				}

			}
			if (count == 2)
				System.out.println(i + "is prime number");

		}

	}
}