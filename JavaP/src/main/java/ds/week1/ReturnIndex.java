package ds.week1;

import org.junit.Test;

public class ReturnIndex {

	/*
	 * Given a sorted array of distinct integers and a target value, return the
	 * index if target is found. If not return the index where it would be if it
	 * were inserted in order.
	 *
	 * Example1: Input: nums=[1,3,5,6], target=5 Output: 2
	 *
	 * Example2: Input: nums=[1,3,5,6], target=2 Output: 1
	 */

	@Test
	public void example1() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		System.out.println(findIndex(nums, target));
	}

	@Test
	public void example2() {
		int[] nums = { 6, 9, 10, 12, 15 };
		int target = 5;
		System.out.println(findIndex(nums, target));
	}

	@Test
	public void example3() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		System.out.println(findIndex(nums, target));
	}

	@Test
	public void example4() {
		int[] nums = { -5, -4, -2, -1 };
		int target = 1;
		System.out.println(findIndex(nums, target));
	}

	private int findIndex(int[] nums, int target) {
		// TODO Auto-generated method stub

		if (nums.length == 0)
			throw new RuntimeException("Index not found");

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;

			}

		}
		throw new RuntimeException("Index not found");

	}

}
