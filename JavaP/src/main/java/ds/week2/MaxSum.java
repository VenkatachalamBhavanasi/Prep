package ds.week2;

import org.junit.Test;

public class MaxSum {

	/*
	 * Find the window of size target with max sum num = { 1, 5, 2, 3, 7, 1 };
	 * target = 3; Output= 12
	 */

	@Test
	public void example2() {

		int[] numbers = { 12, 3, 1, 4, 7, -3 };
		int target = 2;
		int sum = slidingWindow(numbers, target);
		System.out.println(sum);
		System.out.println(getMaxSum(numbers, target));
	}

	@Test
	public void example3() {
		int[] numbers = { 2, 1, 7, 8, 9 };
		int target = 5;
		int sum = slidingWindow(numbers, target);
		System.out.println(sum);
	}

	@Test
	public void example4() {
		int[] numbers = { 2, 1, 7, 8, 9 };
		int target = 6;
		int sum = slidingWindow(numbers, target);
		System.out.println(sum);
	}

	@Test
	public void example5() {
		int[] numbers = { -4, -3, -2 };
		int target = 2;
		int sum = slidingWindow(numbers, target);
		System.out.println(sum);
	}

	/*
	 * Psuedo
	 *
	 *
	 * First time -> first k values are added and stored as Max Loop through each
	 * elements upto the target -> Deduct the previous element from the sum -> Add
	 * the next element to the sum -> Compare the current sum with max -> If it is
	 * max -> store Continue until the last value and return the max
	 */

	private int getMaxSum(int[] numbers, int target) {

		if (numbers.length < target)
			throw new RuntimeException("Invalid target");

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length - target + 1; i++) {
			System.out.println(numbers.length - target + 1);
			int current = 0;
			for (int j = 0; j < target; j++) {
				System.out.println("Iteration");
				current += numbers[i + j];
				int s = numbers[i + j];
				System.out.println(s);
			}
			max = Math.max(max, current);
		}
		return max;

	}

	private int slidingWindow(int[] numbers, int target) {
		// TODO Auto-generated method stub
		if (numbers.length < target || target <= 0)
			throw new RuntimeException("Invalid target");

		// First target sum
		int max = 0;
		for (int i = 0; i < target; i++) {
			max += numbers[i];
		}

		// current sum
		int current = max;

		// rest of the window to slide
		for (int i = target; i < numbers.length; i++) {
			current += numbers[i] - numbers[i - target];
			max = Math.max(current, max);
		}

		return max;
	}

}
