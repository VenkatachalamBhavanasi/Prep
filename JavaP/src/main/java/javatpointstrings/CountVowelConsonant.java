package javatpointstrings;

import org.junit.Test;

public class CountVowelConsonant {

	@Test
	public void example() {

		String str = "This is a really @# simple sentence";
		countVowelsConsonants(str);

	}

	private void countVowelsConsonants(String str) {
		// TODO Auto-generated method stub
		int cCounter = 0, vCounter = 0;
		String replaceAll = str.toLowerCase().replaceAll("\\s+", "");
		for (int i = 0; i < replaceAll.length(); i++) {

			if (replaceAll.charAt(i) == 'a' || replaceAll.charAt(i) == 'e' || replaceAll.charAt(i) == 'i'
					|| replaceAll.charAt(i) == 'o' || replaceAll.charAt(i) == 'u') {
				vCounter++;

			} else if (replaceAll.charAt(i) >= 'a' && replaceAll.charAt(i) <= 'z') {
				cCounter++;

			}

		}
		System.out.println("vowels count " + vCounter + " consonant " + cCounter);

	}

}
