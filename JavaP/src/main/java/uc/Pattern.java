package uc;

import org.junit.Test;

public class Pattern {

	@Test
	public void example() {

		int row = 5;
		printRightAngledTriangle(row);
		printLeftAngledTriangle(row);
		printLeftAngledTrianglewithSpace(row);

	}

	private void printLeftAngledTrianglewithSpace(int row) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= row; i++) {

			for (int j = 2*(row-i); j >= 0; j--) {
				System.out.print(" ");

			}

			for (int j = 0; j < i; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}

	}

	private void printLeftAngledTriangle(int row) {
		// TODO Auto-generated method stub
		for (int i = 0; i < row; i++) {

			for (int j = i; j < row; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}

	}

	private void printRightAngledTriangle(int row) {
		// TODO Auto-generated method stub

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print("* ");

			}
			System.out.println();

		}

	}

}
