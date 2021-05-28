package javatpoint.matrix;

import java.util.Arrays;

import org.junit.Test;

public class AddMatrix {

	@Test
	public void example() {
		int[][] num1 = new int[][] { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		int num2[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

		addTwoMatrix(num1, num2);

	}

	private void addTwoMatrix(int[][] num1, int[][] num2) {
		// TODO Auto-generated method stub
		int[][] num3 = new int[3][3];

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				num3[i][j] = num1[i][j] + num2[i][j];

				System.out.print(num3[i][j] + " ");

			}
			System.out.println();

		}

		System.out.println(Arrays.toString(num3));

	}

}
