package javatpointstrings;

import org.junit.Test;

public class DuplicateCharacters {

	@Test
	public void example() {

		String string1 = "Great responsibility";

		duplicateCharacter(string1);

	}

	private void duplicateCharacter(String str) {
		// TODO Auto-generated method stub

		char[] charArray = str.toLowerCase().replaceAll("\\s+", "").toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			int count = 1;

			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == charArray[j]) {
					count++;
					charArray[j]=0;

				}

			}
		if (count>1 && charArray[i] != '0') {

			System.out.println(charArray[i]);

		}

		}

	}

}
