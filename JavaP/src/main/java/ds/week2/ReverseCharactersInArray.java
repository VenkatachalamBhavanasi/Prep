package ds.week2;

import java.util.Arrays;

import org.junit.Test;

public class ReverseCharactersInArray {

	/*
	 * Write a function that reverses a string. The input string is given as an
	 * array of characters char[]. Do not allocate extra space for another array,
	 * you must do this by modifying the input array in-place with O(1) extra
	 * memory. You may assume all the characters consist of printable ascii
	 * characters. Example 1: Input: ["h","e","l","l","o"] Output:
	 * ["o","l","l","e","h"]
	 *
	 * Example 2: Input: ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
	 */

	@Test
	public void example1() {
		String[] input = { "h", "e", "l", "l", "o" };
		System.out.println(Arrays.toString(reverseArray(input)));
		System.out.println("brute force"+ Arrays.toString(reverseArrayBrute(input)));
	}

	@Test
	public void example2() {
		String[] input = { "h", "a", "n", "n", "a", "h" };
		System.out.println(Arrays.toString(reverseArray(input)));
	}

	@Test
	public void example3() {
		String[] input = { "A" };
		System.out.println(Arrays.toString(reverseArray(input)));
	}

	private String[] reverseArray(String[] input) {
		// TODO Auto-generated method stub
		if (input.length < 2)
			return input;

		int left = 0, right = input.length - 1;

		while (left < right) {
			String temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left++;
			right--;
		}

		return input;
	}

	private String[] reverseArrayBrute(String[] input) {
		// TODO Auto-generated method stub
		String[] output = new String[input.length];
		int start = 0;
		for (int i = input.length - 1; i >= 0; i--) {
			output[start] = input[i];
			start++;

		}
		System.out.println(Arrays.toString(output));
		return output;

	}

}
