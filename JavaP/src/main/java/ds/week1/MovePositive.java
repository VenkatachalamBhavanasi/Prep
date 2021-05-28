package ds.week1;

import java.util.Arrays;

import org.junit.Test;

public class MovePositive {

	/*
	 * Write a program to move all the positive numbers to end.
	 *
	 * Input: [4, -1, 9, 0, 2, -4, 5] Output: [-1, 0, -4, 4, 9, 2, 5]
	 */

	@Test
	public void example1() {
		int[] nums = { 4, -1, 9, 0, 2, -4, 5 };
		System.out.println(Arrays.toString(movePositive(nums)));
	}

	@Test
	public void example2() {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(movePositive(nums)));
	}

	@Test
	public void example3() {
		int[] nums = { -1, 0, -2, -9, -4 };
		System.out.println(Arrays.toString(movePositive(nums)));
	}

	private int[] movePositive(int[] nums) {
		// TODO Auto-generated method stub
		int pos = 0, neg = 0;

		while (neg < nums.length) {
			if (nums[neg] < 0) {
				int temp = nums[pos];
				nums[pos++] = nums[neg];
				nums[neg++] = temp;

			}
			else neg++;

		}

		return nums;
	}

}
