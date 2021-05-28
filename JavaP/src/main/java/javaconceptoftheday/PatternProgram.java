package javaconceptoftheday;

import org.junit.Test;

public class PatternProgram {

@Test
	public void example()
	{
		int noOfRows = 5;
		int rowCount = 1;

		pattern1(noOfRows, rowCount);

	}

	private void pattern1(int noOfRows, int rowCount) {
		// TODO Auto-generated method stub

		for (int i = 0; i < noOfRows; i++) {

			for (int j = 3*i; j <=i; j++) {

				System.out.print(" ");

			}

			for (int j = 0; j <= rowCount; j++) {
				System.out.print(rowCount+" ");

			}

			System.out.println();
			rowCount++;

		}

	}

}
