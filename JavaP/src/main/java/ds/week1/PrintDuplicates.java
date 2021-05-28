package ds.week1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class PrintDuplicates {
	/*
	 * Print duplicates in a given array Input: nums={1,3,8,3,11,5,6,4,7,6,7}
	 * Output: [3,6,7]
	 */
	/*
	 * @Test public void example1() { int[] nums = { 1, 3, 8, 3, 11, 5, 6, 4, 7, 6,
	 * 7, 7 }; System.out.println(findDuplicates(nums)); }
	 *
	 * @Test public void example2() { int[] nums = { 1, 2, 3, 4, 5 };
	 * System.out.println(findDuplicates(nums)); }
	 */

	@Test
	public void example3() {
		int[] nums = { 7, 7, 7 };
		System.out.println(findDuplicates(nums));
	}

	private String findDuplicates(int[] nums) {
		// TODO Auto-generated method stub
		if (nums.length < 2)
			return "[]";

		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();

		for (int eachElement : nums) {

			if (!unique.add(eachElement) || duplicate.contains(eachElement)) {

				unique.remove(eachElement);
				duplicate.add(eachElement);


			}


		}
		//System.out.println("unique"+unique.toString());
	//	System.out.println("duplicate"+duplicate);


		return duplicate.toString();

	}

}
