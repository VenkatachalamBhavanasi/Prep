package javatpointarrays;

import java.util.Arrays;

import org.junit.Test;

public class LeftRotate {

	@Test
	public void example() {

		int[] nums = { 1, 2, 3, 4, 5 };
		int n = 3;

		leftRotate(nums, n);

	}

	/*
	 * psudoCode
	 *
	 *
	 *
	 *
	 */

	private void leftRotate(int[] nums, int n) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < n; i++) {
			temp = nums[0];
			for (int j = 0; j < nums.length - 1; j++) {
				nums[j] = nums[j + 1];

			}
			nums[nums.length - 1] = temp;

		}
		System.out.println(Arrays.toString(nums));

	}

}
