package ds.week3;

import java.util.HashMap;

import org.junit.Test;

public class JewelStone {

	/*
	 * You're given strings jewels representing the types of stones that are jewels,
	 * and stones representing the stones you have. Each character in stones is a
	 * type of stone you have. You want to know how many of the stones you have are
	 * also jewels.
	 *
	 * Letters are case sensitive, so "a" is considered a different type of stone
	 * from "A".
	 *
	 * Example 1:
	 *
	 * Input: jewels = "aA", stones = "aAAbbbb" Output: 3 Example 2:
	 *
	 * Input: jewels = "z", stones = "ZZ" Output: 0
	 */

	@Test
	public void example1() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int stoneCount = getStoneCount(jewels, stones);
		System.out.println(stoneCount);
	}

	@Test
	public void example2() {
		String jewels = "z";
		String stones = "ZZ";
		int stoneCount = getStoneCount(jewels, stones);
		System.out.println(stoneCount);
	}

	@Test
	public void example3() {
		String jewels = "abc";
		String stones = "k";
		int stoneCount = getStoneCount(jewels, stones);
		System.out.println(stoneCount);
	}

	private int getStoneCount(String jewels, String stones) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stones.length(); j++) {
				if (jewels.charAt(i) == stones.charAt(j)) {
					count++;

				}

			}

		}

		return count;
	}

	private int getStoneCountUsingHash(String jewels, String stones) {

		int count = 0;
		HashMap<Character, Integer> jewelStones = new HashMap<>();
		for (int i = 0; i < stones.length(); i++) {
			jewelStones.put(stones.charAt(i), jewelStones.getOrDefault(stones.charAt(i), 0) + 1);

		}
		for (int i = 0; i < jewels.length(); i++) {
			count += jewelStones.getOrDefault(jewels.charAt(i), 0);
		}

		return count;

	}
}
