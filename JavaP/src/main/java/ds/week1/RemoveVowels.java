package ds.week1;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RemoveVowels {

	/*
	 * Given a string, remove the vowels from the string and print the string
	 * without vowels. Input : youwillwinthis Output : ywllwnths
	 *
	 * Input : what is your name ? Output : wht s yr nm ?
	 */

	@Test
	public void example1() {
		String input = "youwillwinthis";
		System.out.println(removeVowels(input));
	}

	@Test
	public void example2() {
		String input = "What Is Your Name?";
		System.out.println(removeVowels(input));
	}

	@Test
	public void example3() {
		String input = "crypts";
		System.out.println(removeVowels(input));
	}

	@Test
	public void example4() {
		String input = "Aaeiou";
		System.out.println(removeVowels(input));
	}

	private String removeVowels1(String input) {
		// TODO Auto-generated method stub

		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		input = input.toLowerCase();
		String output = "";
		for (Character character : input.toCharArray()) {
			if (!vowels.contains(character)) {
				output += character;

			}

		}

		return output;
	}

	private String removeVowels(String input) {
		// TODO Auto-generated method stub

		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		input = input.toLowerCase();
		String output = "";
		for (Character character : input.toCharArray()) {
			if (!vowels.contains(character)) {
				output = output + character;

			}

		}

		return output;
	}

}
