package ds.week1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindSqaures {
	/*
	 * Given an integer array nums sorted in non-decreasing order, return an array
	 * of the squares of each number sorted in non-decreasing order. Example 1:
	 * Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After
	 * squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes
	 * [0,1,9,16,100]. Example 2: Input: nums = [-7,-3,2,3,11] Output:
	 * [4,9,9,49,121] [3,3,3,3,4]
	 *
	 * Constraints: nums is sorted in non-decreasing order. Solve by BruteForce !!
	 */
	@Test // Positive

	public void example1() {
		int[] nums = { -4, -1, 0, 3, 10 };
		int[] squareAndSort = squareAndSort(nums);
		System.out.println(Arrays.toString(squareAndSort));
		Assert.assertEquals(true, Arrays.equals(squareAndSort, new int[] { 0, 1, 9, 16, 100 }));

	}

	@Test // Edge
	public void example2() {
		int[] nums = { 2, 3, 3, 3, 7 };
		int[] squareAndSort = squareAndSort(nums);
		System.out.println(Arrays.toString(squareAndSort));
		Assert.assertEquals(true, Arrays.equals(squareAndSort, new int[] { 4, 9, 9, 9, 49 }));
	}

	@Test // Negative
	public void example3() {
		int[] nums = {};
		int[] squareAndSort = squareAndSort(nums);
		System.out.println(Arrays.toString(squareAndSort));
		Assert.assertEquals(true, Arrays.equals(squareAndSort, new int[] {}));
	}

	private int[] squareAndSort(int[] nums) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i] * nums[i];

		}
		Arrays.sort(nums1);

		return nums1;
	}

}
