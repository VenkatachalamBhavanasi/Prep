package mon.march22.learn;

import java.util.Arrays;

import org.junit.Test;

public class SortByDec {

	@Test
	public void example() {

		int a[] = { 12, 5, 56, -2, 32, 2, -26, 9, 43, 94, -78 };

		//sortByDecOrder(a);
		sortByDecOrder1(a);

	}

	private void sortByDecOrder1(int[] a) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {

				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;

			}

		}
		System.out.println(Arrays.toString(a));

	}

	private void sortByDecOrder(int[] a) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}

		System.out.println(Arrays.toString(a));

	}

}
