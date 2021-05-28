package ds.week3;

public class UniqueNumbersForLoop {

	/**
	 * Prints all unique numbers in the array arr using for loops
	 *
	 * @param arr
	 */
	static void printUnique(int arr[]) {

		int length = arr.length;
		// For loop picks all elements one by one
		System.out.print("Printing unique number from array are: ");
		for (int i = 0; i < length; i++) {
			// Check if the picked element is already printed
			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					break;
			}

			// If not printed earlier, then print it
			if (i == j)
				System.out.print(arr[i] + " ");

		}
	}

	// Main Driver Program
	public static void main(String[] args) {
		int arr[] = { 2, 2, 1 };
		printUnique(arr);

	}

}