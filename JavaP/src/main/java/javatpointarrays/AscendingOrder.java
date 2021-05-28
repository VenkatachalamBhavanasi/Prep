package javatpointarrays;

import java.util.Arrays;

import org.junit.Test;

public class AscendingOrder {

	@Test
	public void example() {

		int[] nums = new int[] { 5, 2, 8, 7, 1 };
		accendingOrder(nums);

	}

	/*
	 * private void accendingOrder1int[] nums) { // TODO Auto-generated method stub
	 * int temp = 0; for (int i = 0; i < nums.length - 1; i++) { if (nums[i] >
	 * nums[i + 1]) { temp = nums[i]; nums[i] = nums[i + 1]; nums[i + 1] = temp;
	 *
	 * }
	 *
	 * } System.out.println(Arrays.toString(nums));
	 *
	 * }
	 */

	private void accendingOrder(int[] nums) { // TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {

					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;

				}
			}

		}
		System.out.println(Arrays.toString(nums));

	}

}
