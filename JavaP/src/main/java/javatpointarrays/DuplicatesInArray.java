package javatpointarrays;

import org.junit.Test;

public class DuplicatesInArray {

	@Test
	public void example() {

		int[] nums = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		duplicatesInArray(nums);



	}

	private void duplicatesInArray(int[] nums) {
		// TODO Auto-generated method stub

		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					System.out.println(nums[i]);

				}

			}

		}

	}

}
