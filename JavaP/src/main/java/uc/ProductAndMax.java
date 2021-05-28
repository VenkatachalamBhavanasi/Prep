package uc;

import java.util.Arrays;

import org.junit.Test;

public class ProductAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test
	public void example() {

		int n[] = { -10, -3, 5, 6, -20};

		System.out.println(max(n));

	}

	private int max(int[] number) {
		int max = Integer.MIN_VALUE;
		int n = number.length;
		if (n < 3) {
			return -1;

		}
		/*
		 * for (int i = 0; i < n; i++) { for (int j = i + 1; j < n; j++) { for (int k =
		 * j + 1; k < n; k++) {
		 *
		 * max = Math.max(max, number[i] * number[j] * number[k]);
		 *
		 * }
		 *
		 * }
		 *
		 * }
		 */
       Arrays.sort(number);
       System.out.println(Arrays.toString(number));

       return Math.max(number[0] * number[1] * number[n - 1],
    		   number[n - 1] * number[n - 2] * number[n - 3]);


		//return max;

	}

}
