package ds.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class SecondLeast {

	/*
	 * Find the second least repeating character in a given string Example: Input:
	 * "tesla-service" Output: s t => 1 (Min) e => 3 (Max) s => 2 (Second Max |
	 * Second Min) l => 1 (Min) a => 1 (Min) r => 1 (Min) v => 1 (Min) i => 1 (Min)
	 * c => 1 (Min) Solve using Map
	 */

	@Test // Positive
	public void example1() {
		String s1 = "Testleaf";
		char c = 'T';
		getLeastOccurance(s1);
	}

	@Test // Edge
	public void example2() {
		String s1 = "tesla-service";
		char[] output = { 'a', 'u', '#' };
		char c = 's';

	}

	@Test // Negative
	public void example3() {
		String s1 = "aaaa";
		char c = ' ';
	}

	@Test // Negative
	public void example4() {
		String s1 = "aabbcd";
		char c = 'c';
	}

	/*
	 * PsuedoCode:
	 *
	 * 1) Convert the String to character array 2) Add the character array to Map
	 * [Initialize] 3) Traverse through the map and find the min value !! 4) Based
	 * on Min value, find the character.
	 *
	 * Constraint : Use only Map !!
	 *
	 */

	private void getLeastOccurance(String s1) {
		// TODO Auto-generated method stub
		char[] charArray = s1.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
			System.out.println(map.toString());
			int minValue = Integer.MAX_VALUE;
			char c = ' ';
			for (Entry<Character, Integer> entry : map.entrySet()) {
				System.out.println("key--->" + entry.getKey());
				System.out.println("value--->" + entry.getValue());
				Integer currValue = entry.getValue();
				minValue = Math.min(minValue, currValue);
				if (minValue == currValue) {
					c = entry.getKey();
				}

			}
			// System.out.println(minValue);
			// System.out.println(c);

		}

	}

	private void getLeastOccurance1(String s1) {
		char[] charArray = s1.toLowerCase().toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
		}
		int minValue = Integer.MAX_VALUE;

		for (Entry<Character, Integer> entrySet : map.entrySet()) {

			Integer currentValue = entrySet.getValue();
			minValue = Math.min(minValue, currentValue);

			if (minValue==currentValue) {
				Character key = entrySet.getKey();

			}


		}


	}

}
