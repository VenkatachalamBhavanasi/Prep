package ds.week3;

import java.util.HashSet;

import org.junit.Test;

public class FindUnique {

	/*
	 * Given a non-empty array of integers nums, every element appears twice except
	 * for one. Find that single one.
	 *
	 * Example 1: Input: nums = [2,2,1] Output: 1
	 *
	 * Example 2: Input: nums = [4,1,2,1,2] Output: 4
	 *
	 * Example 3: Input: nums = [1] Output: 1
	 */

	@Test
	public void example1() {
		int[] data = { 2, 2, 1 };
		int num = findSingle(data);
		// System.out.println(findSingleUsingHashSet(data));
		// System.out.println(num);
		findSingle1(data);
	}

	@Test
	public void example2() {
		int[] data = { 4, 1, 2, 1, 2 };
		// int num = findSingle(data);
		// System.out.println(num);
		findSingle1(data);
	}

	@Test
	public void example3() {
		int[] data = { 1 };
		// int num = findSingle(data);
		// System.out.println(num);
		findSingle1(data);
	}

	private int findSingle(int[] data) {
		// TODO Auto-generated method stub

		int result = 0;
		for (int i = 0; i < data.length; i++) {
			result ^= data[i];
		}
		return result;

	}

	private int findSingleUsingHashSet(int[] data) {
		HashSet<Integer> single = new HashSet<>();
		for (int i = 0; i < data.length; i++) {
			if (!single.add(data[i]))
				single.remove(data[i]);
		}
		return single.iterator().next();

	}

	private void findSingle1(int[] data) {
		// TODO Auto-generated method stub
		int num = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] == data[j])
					break;
				 if (i == j)
			            System.out.print( data[i] + " ");
			}

		}

	}

}
