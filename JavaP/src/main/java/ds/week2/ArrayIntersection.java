package ds.week2;

import java.util.Arrays;

import org.junit.Test;

public class ArrayIntersection {
	@Test
	public void example1() {
		int[] nums1 = { 1, 2, 11, 12 };
		int[] nums2 = { 2, 12 };
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}

	@Test
	public void example2() {
		int[] nums1 = { 4, 5, 9 };
		int[] nums2 = { 4, 4, 8, 9, 9 };
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));

	}

	@Test
	public void example3() {
		int[] nums1 = { 4, 5, 9, 9 };
		int[] nums2 = { 4, 5, 9, 9 };
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}

	@Test
	public void example4() {
		int[] nums1 = { 4, 5, 9, 9 };
		int[] nums2 = { 1, 2, 3 };
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}

	@Test
	public void example5() {
		int[] nums1 = { 4, 5, 9, 9 };
		int[] nums2 = {};
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}



	/*
	 * Bruteforce -> Traverse through both arrays (nested) -> Lowest size on the
	 * first loop, bigger -> second loop -> If both matches, add that to the list ->
	 * Do not take duplicates -> O[N*M] Time + Space O[M]
	 *
	 * Two Pointer -> left > right ->>> move right left < right ->> move left left
	 * reaches length and right reaches length
	 */

	/*
	 * Two Pointer
	 */

	/*
	 * private int[] intersect(int[] nums1, int[] nums2) { // TODO Auto-generated
	 * method stub int[] nums3 = new int[5]; for (int i = 0; i < nums1.length; i++)
	 * { for (int j = 0; j < nums2.length; j++) {
	 *
	 * if (nums1[i]==nums2[j]) { nums3[i] = nums1[i]; break;
	 *
	 * }
	 *
	 * }
	 *
	 * }
	 *
	 * return nums3; }
	 */

	private int[] intersect(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		Arrays.sort(nums1);
		Arrays.sort(nums2);



		return null;
	}

}
