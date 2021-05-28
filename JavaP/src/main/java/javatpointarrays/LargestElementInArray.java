package javatpointarrays;

import org.junit.Test;

public class LargestElementInArray {

	@Test
	public void example() {
		int[] nums = new int[] { 25, 11, 7, 75, 56 };

		largestElementInArray(nums);

	}

	private void largestElementInArray(int[] nums) {
		// TODO Auto-generated method stub

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];

			}

			if (nums[i] < min) {
				min = nums[i];

			}

		}
		System.out.println("Maximum number =" + max+"minimum number"+ min);

	}

}
