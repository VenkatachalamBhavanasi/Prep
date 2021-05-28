package javatpoint.matrix;

import java.util.Arrays;

import org.junit.Test;

public class MovingZeros {

	@Test
	public void texample() {

		int[] num = { 1, 3, 0, 2, 6 };
		movingZeros(num);
		method2(num);
		twoPointer(num);

	}

	private void twoPointer(int[] num) {
		// TODO Auto-generated method stub
		int left = 0, right = 0;

		while (right < num.length) {

			if (num[right] != 0) {

				// swap left and right

				int temp = num[left];
				num[left] = num[right];
				num[right] = temp;
				left++;

			}
			right++;

		}

	}

	private void movingZeros(int[] num) {
		// TODO Auto-generated method stub
		int[] output = new int[num.length];
		int index = 0;

		for (int i : num) {

			if (i != 0) {

				output[index++] = i;

			}

		}
		System.out.println(Arrays.toString(output));

	}

	private void method2(int[] num) {
		int index = 0;
		for (int i : num) {
			if (i != 0) {
				num[index++] = i;

			}
		}
		while (index < num.length) {
			num[index++] = 0;

		}

		System.out.println(Arrays.toString(num));

	}

}
