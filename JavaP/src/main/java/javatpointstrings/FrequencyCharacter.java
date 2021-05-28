package javatpointstrings;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FrequencyCharacter {

	@Test
	public void example() {

		String str = "picture perfect";
		int[] freq = new int[str.length()];
		frequencyCharacter(str);

	}

	private void frequencyCharacter(String str) {
		// TODO Auto-generated method stub

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArray = str.toLowerCase().toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length; j++) {

				if (charArray[i] == charArray[j]) {

					map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
					charArray[j] = 0;

				}

			}

		}
		System.out.println(map);

	}

}
