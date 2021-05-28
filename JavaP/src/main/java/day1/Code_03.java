package day1;

import java.util.Scanner;

public class Code_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1.Write a Java Program to get 3 user inputs Two Numbers One String which can
		 * be either of the below �Add�/�Subtract�/�Multiply�/�Divide� 2. Perform the
		 * equivalent arithmetic operation. 3. Print the result in the console.
		 */
		double var1, var2;
		Scanner input = new Scanner(System.in);
		var1 = input.nextDouble();
		var2 = input.nextDouble();
		String operation = input.next();
		switch (operation) {
		case "Add":
			System.out.println("Addition of " + var1 + " and " + var2 + " is " + (var1 + var2));

			break;

		case "Subtract":
			System.out.println("Addition of " + var1 + " and " + var2 + " is " + (var1 - var2));

			break;
		case "Multiply":
			System.out.println("Addition of " + var1 + " and " + var2 + " is " + (var1 * var2));

			break;
		case "Divide":
			if (var2 != 0)
				System.out.println("Division of " + var1 + " and " + var2 + " is " + (var1 / var2));
			else
				System.out.println("Division cannot be performed for the entered second number (Zero)");
			break;

		default:
			System.out.println("Enter a Valid Operation");
		}

		input.close();

	}

}
