package uc;

import java.util.HashSet;

import org.junit.Test;

public class FirstRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}

	@Test
	public void example() {

		String str = "geeksforgeeks";
        char[] arr = str.toCharArray();
        System.out.println(firstRepeating(arr));

	}


	private char firstRepeating(char[] str) {
		HashSet<Character>set=new HashSet<Character>();
		for (int i = 0; i < str.length; i++) {

			char c=str[i];
			if (set.contains(c)) {
				return c;


			}
			else {
				set.add(c);
			}


		}



		return 0;

	}


}
