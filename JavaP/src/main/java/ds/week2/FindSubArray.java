package ds.week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FindSubArray {
	/*
	 * Find all subarrays matching target Input= {1,7,4,3,1,2,1,5,1}; Target=7
	 * Output=[1,1],[2,3],[3,6],[6,8]
	 */

	@Test
	public void example2() {

		int[] numbers = { 1, 1, 1, 3, 6, 1, 1 };
		int target = 7;
		int[] sum = exactSum(numbers, target);
		System.out.println(Arrays.toString(sum));
	}

	@Test
	public void example3() {

		int[] numbers = { 8, 11, 14, 23 };
		int target = 7;
		int[] sum = exactSum(numbers, target);
		System.out.println(Arrays.toString(sum));
	}

	private int[] exactSum(int[] numbers, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			int current = numbers[i];
			if (current == target)
				return new int[] { i, i };
			if (current > target)
				continue;
			for (int j = i + 1; j < numbers.length; j++) {
				current += numbers[j];
				if (current < target)
					continue;
				if (current > target)
					break;
				if (current == target)
					return new int[] { i, j };

			}

		}

		return new int[] { -1, -1 };
	}

	@Test
	public void example1() {

		int[] numbers = { 1, 7, 4, 3, 1, 2, 1, 5, 1 };
		int target = 7;
		int[] sum = solveUsingHash(numbers, target);
		System.out.println(Arrays.toString(sum));
		System.out.println();
	}

	private int[] solveUsingHash(int[] numbers, int target) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int sum_so_far = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum_so_far += numbers[i];
			int diff = sum_so_far - target;
			if (map.containsKey(diff)) {
				System.out.println("Found the sub array : {" + (map.get(diff) + 1) + " , " + i + "}");

			}
			map.put(sum_so_far, i);

		}

		throw new RuntimeException("There is no matching indices");
	}

}
