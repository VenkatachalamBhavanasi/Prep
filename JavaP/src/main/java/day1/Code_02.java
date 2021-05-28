package day1;

import org.junit.Test;

public class Code_02 {

	public static void main(String[] args) {

		/* check if 121 is a palindrome or not
		 *
		 *
		 *
		 *   */


		// TODO Auto-generated method stub
		/*
		 * System.out.println("Enter the number for Palindrome:"); Scanner scan=new
		 * Scanner(System.in); int numb=scan.nextInt(); int rem, sum=0,temp; temp=numb;
		 * while (numb>0) {
		 *
		 * rem=numb%10; sum=(sum*10)+rem; numb=numb/10;
		 *
		 * } if(temp==sum) { System.out.println(temp +" is a Palindrome Number.");
		 *
		 * } else { System.out.println(temp +" is not a Palindrome Number."); }
		 *
		 * scan.close();
		 */

	}

	@Test
	public void example(){
		int numb=121;
		int temp=palindrome(numb);
		if(temp==numb)
		System.out.println(temp +" is a Palindrome Number.");
		else
			System.out.println(temp +" is not a Palindrome Number.");


	}

	private int palindrome(int number) {
		int sum=0,rem;
		while(number>0) {
			rem=number%10;
			sum=sum*10+rem;
			number=number/10;
		}

		return sum;

	}

}
