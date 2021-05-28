package day1;

import org.junit.Test;

public class code_04_01 {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub

		// String text = "of 283 items";
		String text = "of qqw items";
		// int totalBooks = Integer.parseInt(text.substring(text.indexOf("of")+3,
		// text.indexOf("items")-1));

		// int totalBooks1 = Integer.parseInt(text.substring(text.indexOf("of")+3,
		// text.indexOf("items")-1));

		// String totalBooks2= text.substring(0,3);
		// System.out.println(totalBooks2);
		System.out.println("Enter the Text to determine palindrome or not");
		Scanner input = new Scanner(System.in);

		String orginalPhrase = input.next();
		String reversePhrase = "";
		int n = orginalPhrase.length();

		for (int i = n - 1; i >= 0; i--) {

			reversePhrase = reversePhrase + orginalPhrase.charAt(i);

		}

		if (orginalPhrase.equalsIgnoreCase(reversePhrase)) {
			System.out.println("is palindrome");

		} else {
			System.out.println("not palindrome");

		}

	}*/
	}

	@Test
	public void example() {
		String orginalPhase = "pnp pnp";
		String reversePhrase = "";
		System.out.println(palindrome( orginalPhase, reversePhrase));

	}

	private boolean palindrome(String orginalPhase, String reversePhrase) {
		int n = orginalPhase.length();
		for (int i = n - 1; i >= 0; i--) {
			reversePhrase = reversePhrase + orginalPhase.charAt(i);
		}

		if (orginalPhase.equalsIgnoreCase(reversePhrase)) {
			return true;

		}

		return false;

	}

}
