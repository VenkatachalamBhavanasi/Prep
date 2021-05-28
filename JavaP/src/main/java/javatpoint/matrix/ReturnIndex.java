package javatpoint.matrix;

import java.util.Arrays;

import org.junit.Test;

public class ReturnIndex {

	@Test
	public void example() {

		int[] num = { 2, 7, 11, 15 };
		int target = 9;
		returnIndex(num, target);
		twoPointer(num, target);

	}

	/*
	 * psudocode Traverse from left to right one number on Time pick the value of
	 * the number and subract that from the target Traverse from next number to
	 * right if the difference value is present get the index and stop loop. else
	 * continue.
	 *
	 */

	private int[] twoPointer(int[] num, int target) {
		// TODO Auto-generated method stub

		int left = 0, right = num.length - 1;

		while (left < right) {

			if (num[left] + num[right] == target) {

				return new int[] { left, right };

			} else if (num[left] + num[right] > target) {

				right--;

			} else
				left++;

		}
		return new int[] { -1, -1 };

	}

	private void returnIndex(int[] num, int target) {
		// TODO Auto-generated method stub

		int[] indices = new int[2];
		for (int i = 0; i < num.length; i++) {
			int diff = target - num[i];

			for (int j = i + 1; j < num.length; j++) {

				if (num[j] == diff) {

					indices[0] = i;
					indices[1] = j;
					break;

				}

			}

		}
		System.out.println(Arrays.toString(indices));

	}

}
