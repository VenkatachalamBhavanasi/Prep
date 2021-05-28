package javatpointstrings;

import org.junit.Test;

public class DuplicateWord {

	@Test
	public void example() {

		String string = "Big black bug bit a big black dog on his big black nose";
		duplicateWord(string);

	}

	private void duplicateWord(String string) {
		// TODO Auto-generated method stub
		String[] words = string.toLowerCase().split(" ");

		for (int i = 0; i < words.length; i++) {
			int count = 1;

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;

					words[j] = "0";

				}

			}

			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);

		}

	}

}
