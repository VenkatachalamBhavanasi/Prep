package javatpointarrays;

import org.junit.Test;

public class PrintEvenOdd {

	@Test
	public void example() {

		int number = 100;

		evenOdd(number);

	}

	private void evenOdd(int number) {
		// TODO Auto-generated method stub
		for (int i = 2; i < number; i++) {

			if (i % 2 == 0) {
				System.out.println("Even" + i);

			} else
				System.out.println("Odd" + i);

		}

	}

}
