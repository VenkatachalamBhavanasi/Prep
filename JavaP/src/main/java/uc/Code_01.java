package uc;

import org.junit.Test;

public class Code_01 {
	@Test
	public void example1() {

		int n[] = { 13, 15, 67, 88, 65, 13, 67, 99, 65, 87, 13, 99, 199 };
		System.out.println(sumOfArray(n));
	}

	@Test
	public void example2() {

		int n[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		System.out.println(sumOfArray(n));
	}

	@Test
	public void example3() {

		int n[] = { 1, -2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(sumOfArray(n));
	}

	private int sumOfArray(int[] n) {
		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}
		return sum;

	}

}
