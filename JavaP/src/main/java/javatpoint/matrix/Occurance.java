package javatpoint.matrix;

import org.junit.Test;

public class Occurance {

	@Test
	public void example() {

		int[] nums = { 3, 4, 1, 5, 3, 2 };
		int k = 3;

		getOccurance(nums, k);

	}

	private void getOccurance(int[] nums, int k) {
		// TODO Auto-generated method stub
		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == k) {
				count++;

			}

		}

		System.out.println(count);

	}

}
