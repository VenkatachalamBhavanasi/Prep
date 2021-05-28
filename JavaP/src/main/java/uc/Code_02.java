package uc;

import org.junit.Test;

public class Code_02 {

	@Test
	public void example1() {
		System.out.println(multipleWithAddition(5, 10));
	}

	private int multipleWithAddition(int n, int m) {
		int sum = 0;

		for (int i = 1; i <= m; i++) {
			sum = sum + n;
		}
		return sum;

	}

}
