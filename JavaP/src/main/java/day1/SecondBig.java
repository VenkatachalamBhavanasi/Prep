package day1;

import java.util.Arrays;

import org.junit.Test;

public class SecondBig {

	@Test
	public void example() {

		int a[] = { 1, 2, 5, 6, 3, 2 };

	//	secondLargest(a);
		//System.out.println(secondLargest(a));
		sortByAce(a);

	}

	private void sortByAce(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length-1; i++) {

			if (a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;

				i = -1;

			}

		}
		System.out.println(Arrays.toString(a));

	}

	private int secondLargest(int[] a) {
		// TODO Auto-generated method stub

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(a));
		return a[a.length - 2];

	}

}
