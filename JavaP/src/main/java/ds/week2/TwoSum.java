package ds.week2;

import java.util.Arrays;

import org.junit.Test;

public class TwoSum {

	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 *
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
	 * nums[1] == 9, we return [0, 1].
	 *
	 */

	@Test
	public void example1() {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(bruteForce(nums, target)));
		System.out.println(Arrays.toString(twoPointer(nums, target)));
	}

	@Test
	public void example2() {
		int[] nums = { 2, 3, 4 };
		int target = 6;
		System.out.println(Arrays.toString(bruteForce(nums, target)));
		System.out.println(Arrays.toString(twoPointer(nums, target)));

	}

	@Test
	public void example3() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int target = 1;
		System.out.println(Arrays.toString(bruteForce(nums, target)));
		System.out.println(Arrays.toString(twoPointer(nums, target)));

	}

	private int[] twoPointer(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left = 0, right = nums.length - 1;
		while (left < right) {
			if (nums[left] + nums[right] == target) {
				return new int[] { left, right };

			}

			else if (nums[left] + nums[right] > target) {
				right--;

			} else {
				left++;
			}

		}

		return new int[] { -1, -1 };
	}

	private int[] bruteForce(int[] nums, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };

				}

			}

		}
		return new int[] { -1, -1 };
	}
}
