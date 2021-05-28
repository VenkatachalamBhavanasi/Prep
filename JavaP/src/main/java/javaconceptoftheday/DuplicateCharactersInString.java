package javaconceptoftheday;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class DuplicateCharactersInString {

	@Test
	public void example() {

		String string = "JavaJ2EE";
		duplicateCharactersInString(string);

	}

	private void duplicateCharactersInString(String string) {
		// TODO Auto-generated method stub

		char[] charArray = string.toLowerCase().toCharArray();

		Map<Character, Integer> orginalCharacter = new HashMap<Character, Integer>();

		for (char c : charArray) {

			if (orginalCharacter.containsKey(c)) {
				orginalCharacter.put(c, orginalCharacter.getOrDefault(c, 0) + 1);

			} else {
				orginalCharacter.put(c, 1);

			}

		}

		//System.out.println(orginalCharacter);

		Set<Character> keySet = orginalCharacter.keySet();

		for (Character character : keySet) {
			//System.out.println(character);
			if (orginalCharacter.get(character) > 1) {
				System.out.println(character);

			}

		}

	}

}
