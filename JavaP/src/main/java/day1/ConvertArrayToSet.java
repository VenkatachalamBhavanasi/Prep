package day1;

import java.util.HashSet;

import org.junit.Test;

public class ConvertArrayToSet {

	@Test
	public void example() {

		int a[] = { 1, 2, 5, 6, 3, 2 };

		convertArrayToSet(a);

	}

	@Test
	public void example1() {

		char a[] = { 'a', 'b', 'a' };

		convertArrayToSet1(a);

	}

	@Test
	public void example3() {

		String a[] = { "hello", "hello", "yello" };

		convertArrayToSet2(a);

	}

	@Test
	public void example4() {

		String a= "this is very this";

		convertArrayToSet3(a);

	}

	private void convertArrayToSet3(String a) {
		// TODO Auto-generated method stub

		String[] split = a.split(" ");
		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < split.length; i++) {

			set.add(split[i]);

		}

		System.out.println(set);

	}





	private void convertArrayToSet2(String[] a) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < a.length; i++) {

			set.add(a[i]);

		}

		System.out.println(set);

	}

	private void convertArrayToSet1(char[] a) {
		// TODO Auto-generated method stub

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < a.length; i++) {

			set.add(a[i]);

		}

		System.out.println(set);

	}

	private void convertArrayToSet(int[] a) {
		// TODO Auto-generated method stub

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {

			set.add(a[i]);

		}

		System.out.println(set);

		// String[] array = {"a", "b", "c"};
		// Set<String> set = new HashSet<>(Arrays.asList(array));

	}

}
