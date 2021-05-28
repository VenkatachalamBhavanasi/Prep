package javatpointarrays;

import org.junit.Test;

public class CopyArray {

	@Test
	public void example() {
		int[] nums = { 1, 2, 3, 4, 5 };
		copyElementsToArray(nums);

	}

	private void copyElementsToArray(int[] nums) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i];

		}

		for (int i : nums1) {
			System.out.println(i);

		}

	}

}
