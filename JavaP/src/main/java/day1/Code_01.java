package day1;

import org.junit.jupiter.api.Test;

public class Code_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Factorial
		/*
		 * System.out.println("Enter the factorial number"); Scanner scan=new
		 * Scanner(System.in); int number=scan.nextInt(); int fact=1; for (int i =
		 * number; i > 1; i--) { fact=fact*i;
		 *
		 * } System.out.println("fact  = "+fact);
		 *
		 *
		 *
		 * System.out.println("Enter the factorial number"); Scanner scan=new
		 * Scanner(System.in); int number=scan.nextInt(); int fact=1; for (int i = 1; i
		 * <= number; i++) { fact=fact*i;
		 *
		 * } System.out.println("fact  = "+fact);
		 *
		 *
		 *
		 */

	}

	@Test // Positive
	public void example1() {
		int number = 14;
		System.out.println(factorial(number));

	}

	@Test // Positive
	public void example2() {
		int number = 5;
		// int num = factorial(number);
		System.out.println(factorial(number));

	}

	private int factorial(int number) {
		int fact = 1;
		for (int i = 0; i < number; i++) {
			fact = fact * (i + 1);
		}

		return fact;

	}

}
