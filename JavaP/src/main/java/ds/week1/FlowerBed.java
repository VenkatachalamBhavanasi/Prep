package ds.week1;

import org.junit.Test;

public class FlowerBed {
	/*
	 * You have a long flowerbed in which some of the plots are planted, and some
	 * are not. However, flowers cannot be planted in adjacent plots. Given an
	 * integer array flowerbed containing 0's and 1's, where 0 means empty and 1
	 * means not empty, and an integer n, return if n new flowers can be planted in
	 * the flowerbed without violating the no-adjacent-flowers rule.
	 *
	 * Example 1: Input: flowerbed = [1,0,0,0,1], n = 1 Output: true
	 *
	 * Example 2: Input: flowerbed = [1,0,0,0,1], n = 2 Output: false
	 */

	@Test
	public void example1() {
		int[] nums = { 1, 0, 0, 0, 1 };
		int n = 1;
		System.out.println(plantFlowers(nums, n));
	}

	@Test
	public void example2() {
		int[] nums = { 1, 0, 0, 0, 1 };
		int n = 2;
		System.out.println(plantFlowers(nums, n));
	}

	@Test
	public void example3() {
		int[] nums = { 0, 0, 1, 0, 1 };
		int n = 1;
		System.out.println(plantFlowers(nums, n));
	}

	@Test
	public void example4() {
		int[] nums = { 1, 0, 0, 0, 1, 0, 0 };
		int n = 2;
		System.out.println(plantFlowers(nums, n));
	}

	private boolean plantFlowers(int[] nums, int n) {
		// TODO Auto-generated method stub
		/*
		 * for (int i = 0; i < nums.length; i++) { int prev = 0, next = 0; if (i > 0)
		 * prev = nums[i - 1];
		 *
		 * if (i < nums.length - 1) next = nums[i + 1];
		 *
		 * if (nums[i] == 0 && prev == 0 && next == 0) { nums[i] = 1; n--; } if (n == 0)
		 * return true;
		 *
		 * }
		 */

		for (int i = 0; i < nums.length; i++) {
			int previous = 0, next = 0;
			if (i > 0)
				previous = nums[i - 1];
			if (i < nums.length - 1)
				next = nums[i + 1];
			if (nums[i] == 0 && previous == 0 && next == 0) {
				nums[i] = 1;
				n--;

			}
			if (n == 0) {
				return true;

			}

		}
		return false;
	}

}
