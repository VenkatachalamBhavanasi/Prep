package javatpointstrings;

import org.junit.Test;

public class CharactersInString {

	@Test
	public void example() {

		String string = "The best of both worlds";

		String replaceAll = string.toLowerCase().replaceAll("\\s+", "");
		System.out.println(replaceAll);
		charactersInString(replaceAll);

	}

	private void charactersInString(String replaceAll) {
		// TODO Auto-generated method stub

		int counter=0;
		for (int i = 0; i < replaceAll.length(); i++) {

			if (replaceAll.charAt(i) !=' ') {
				counter++;

			}

		}

		System.out.println(counter);

	}

}
