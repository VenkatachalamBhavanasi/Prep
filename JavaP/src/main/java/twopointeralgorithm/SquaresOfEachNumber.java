package twopointeralgorithm;

import java.util.Arrays;

import org.junit.Test;

public class SquaresOfEachNumber {

    @Test
	public void example() {

		int[] nums = { -4, -1, 0, 3, 10 };

		squareOfEachNumber(nums);

	}

	private void squareOfEachNumber(int[] nums) {
		// TODO Auto-generated method stub
		int left = 0, right = nums.length - 1;
		int[] sq = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			left = nums[i] * nums[i];
			sq[i] = left;

		}
		System.out.println(Arrays.toString(sq));

	}

}
