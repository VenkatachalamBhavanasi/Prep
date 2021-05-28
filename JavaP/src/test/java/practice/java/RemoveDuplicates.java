package practice.java;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RemoveDuplicates {

	@Test
	public void example() {

		List<String> list = new ArrayList<>();

		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("banana");

		//removeDuplicates(list);

		for (int i = 0; i < list.size(); i++) {

			String string = list.get(i);
			System.out.println(list.get(i));

		}





	}
	/*
	 * private void removeDuplicates(List<String> list) { // TODO Auto-generated
	 * method stub List<String> unique = new ArrayList<>(); List<String> duplicates
	 * = new ArrayList<>();
	 *
	 * for (String values : list) {
	 *
	 * if (unique.contains(values) || duplicates.contains(values)) {
	 *
	 * //unique.remove(values); duplicates.add(values);
	 *
	 * } else { unique.add(values);
	 *
	 * }
	 *
	 * }
	 *
	 * System.out.println("unique" + unique);
	 *
	 * System.out.println("duplicates" + duplicates);
	 *
	 * }
	 */

}
