package javatpointstrings;

import java.util.Arrays;

import org.junit.Test;

public class SubStringOfString {


	@Test
	public void example() {
		String str = "FUN";
		subString(str);

	}

	private void subString(String str) {
		// TODO Auto-generated method stub

		int temp = 0;
		int length = str.length();
		String[] str1 = new String[length * (length + 1) / 2];

		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				str1[temp] = str.substring(i, j+1);
				temp++;

			}

		}
		System.out.println(Arrays.toString(str1));

	}

}
