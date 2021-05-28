package javatpoint.matrix;

import org.junit.Test;

public class MultiplyTwoMatix {

	@Test
	public void example() {
		int[][] num1 = new int[][] { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		int num2[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

		MultiplyTwoMatrix(num1, num2);

	}

	private void MultiplyTwoMatrix(int[][] a, int[][] b) {
		// TODO Auto-generated method stub

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				} // end of k loop
				System.out.print(c[i][j] + " "); // printing matrix element
			} // end of j loop
			System.out.println();// new line
		}

	}

}
