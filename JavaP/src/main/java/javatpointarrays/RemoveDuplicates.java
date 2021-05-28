package javatpointarrays;

import java.util.Arrays;
import java.util.TreeSet;

import org.junit.Test;

public class RemoveDuplicates {

	@Test
	public void example() {
		int numbers[] = { 10, 20, 20, 30, 30, 40, 50, 50 };

		removeDuplicates1(numbers);

	}

	private void removeDuplicates(int[] numbers) {
		// TODO Auto-generated method stub

		TreeSet<Integer> withOutDuplicates = new TreeSet<Integer>();

		for (int i = 0; i < numbers.length; i++) {

			withOutDuplicates.add(numbers[i]);

		}

		System.out.println(withOutDuplicates);

	}

	private void removeDuplicates1(int[] numbers) {

		int[] temp = new int[numbers.length];
		int j = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] != numbers[i + 1]) {
				temp[j++] = numbers[i];
			}
		}
		temp[j++] = numbers[numbers.length - 1];

		System.out.println(Arrays.toString(temp));

	}

}
