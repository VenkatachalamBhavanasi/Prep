package ds.week2;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	@Test
	public void example1() {
		int[] nums = { 4, 0, 2, 0, 0, 1 };
		int[] moveZeroes = moveZeroes(nums);
		System.out.println(Arrays.toString(moveZeroes));
		System.out.println(Arrays.toString(twoPointer(nums)));
	}

	@Test
	public void example2() {
		int[] nums = { 0, 0, 0, 1, 1, 1 };
		int[] moveZeroes = moveZeroes(nums);
		System.out.println(Arrays.toString(moveZeroes));
		System.out.println(Arrays.toString(twoPointer(nums)));

	}

	@Test
	public void example3() {
		int[] nums = { 1, 2, 3, 4, 5 };
		int[] moveZeroes = moveZeroes(nums);
		System.out.println(Arrays.toString(moveZeroes));
		System.out.println(Arrays.toString(twoPointer(nums)));

	}

	private int[] twoPointer(int[] nums) {
		// TODO Auto-generated method stub
		int left = 0, right = 0;
		while (right < nums.length) {
			if (nums[right] != 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;

			}

			right++;
		}

		return nums;
	}

	private int[] moveZeroes(int[] nums) {
		// TODO Auto-generated method stub

		int[] output = new int[nums.length];
		int j = 0;
		for (int i = 0; i < output.length; i++) {
			if (nums[i] != 0) {
				output[j++] = nums[i];

			}

		}
		return output;
	}

}
