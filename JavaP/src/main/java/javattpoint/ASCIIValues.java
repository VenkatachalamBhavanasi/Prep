package javattpoint;

import org.junit.Test;

public class ASCIIValues {

	@Test
	public void asciivValues() {

		// characters whose ASCII value to be found
		char ch1 = 'a';
		char ch2 = 'b';
		// casting or converting a charter into int type
		int ascii1 = ch1;
		int ascii2 = ch2;
		System.out.println("The ASCII value of a is: " + ascii1);
		System.out.println("The ASCII value of b is: " + ascii2);

	}

	@Test
	public void asciivValues1() {
		for (int i = 0; i <= 255; i++) {
			System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
		}

	}

}
