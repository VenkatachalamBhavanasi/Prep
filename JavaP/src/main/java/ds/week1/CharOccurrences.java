package ds.week1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CharOccurrences {
	/*
	Find occurrence of each character

	Input: String input="welcome to automation"
	Output:
	w=1, e=2, l=1, c=1, o=4, m=2, t=3, a=2, u=1, i=1, n=1,  =2
	 */

	@Test
	public void example1() {
		String input="Welcome to automation";
		System.out.println(returnEachOccurrences(input));
	}

	@Test
	public void example2() {
		String input="word";
		System.out.println(returnEachOccurrences(input));
	}

	@Test
	public void example3() {
		String input="Automation";
		System.out.println(returnEachOccurrences(input));
	}

	@Test
	public void example4() {
		String input="";
		System.out.println(returnEachOccurrences(input));
	}

	private Map<Character, Integer> returnEachOccurrences(String input) {
		// TODO Auto-generated method stub

		Map<Character, Integer> output= new HashMap<Character, Integer>();
		char[] charArray = input.toLowerCase().toCharArray();
		for (char c : charArray) {
			output.put(c, output.getOrDefault(c, 0)+1);


		}





		return null;
	}

}
