package ds.week1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	/*2 Sum problem - Largest asked problem across world !!
	Given an array of integers say nums and an integer say target, return indices of the two numbers such that they add up to target.
	You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.
	Example:
	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation:
	nums[0] + nums[1] == 9, so we
	return [0, 1].
	Example:
	Input: nums = [2,2,2,5,4,1,3], target = 6
	Output: [3,3]
	Example:
	Input: nums = [-3,11], target = 8
	Output: [0,1]
	*/
	// Brute Force Algorithm !!

		@Test // Positive
		public void example1() {
			int[] numbers = {1,2,11,15,7};
			int k = 9; // 9 - (2) = 7
			int[] matchingIndices = getMatchingIndices(numbers, k);
			System.out.println(Arrays.toString(matchingIndices));
			Assert.assertEquals(true, Arrays.equals(matchingIndices, new int[] {1,4}));
		}

		@Test // Edge
		public void example2() {
			int[] numbers = {2,-9,11,15,1};
			int k = 2; // 2 - (-9) = 11
			int[] matchingIndices = getMatchingIndices(numbers, k);
			System.out.println(Arrays.toString(matchingIndices));
			Assert.assertEquals(true, Arrays.equals(matchingIndices, new int[] {1,2}));

		}

		@Test // Negative
		public void example3() {

			int[] numbers = {4,6,7,3,2};
			int k = 2;
			int[] matchingIndices = getMatchingIndices(numbers, k);
			System.out.println(Arrays.toString(matchingIndices));
			Assert.assertEquals(true, Arrays.equals(matchingIndices, new int[] {0,0}));

		}

		private int[] getMatchingIndices(int[] numbers, int k) {
			// TODO Auto-generated method stub
			int[] numb= new int[2];
			boolean bFound = false;
		/*
		 * for (int i = 0; i < numbers.length; i++) {
		 *
		 * int diff=k-numbers[i]; for (int j = i+1; j < numbers.length; j++) { if
		 * (numbers[j]==diff) { numb[0]=i; numb[1]=j; bFound = true; break;
		 *
		 *
		 * }
		 *
		 * } if(bFound) break;
		 *
		 * }
		 */

			for (int i = 0; i < numbers.length; i++) {
				for (int j = i+1; j < numbers.length; j++) {
					if (numbers[i]+numbers[j]==k) {
						numb[0]=i;
						numb[1]=j;
						bFound = true;
						break;

					}
					 if(bFound) break;

				}

			}

			return numb;
		}

}
