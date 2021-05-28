package pra;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MapPra {

	@Test
	public void example() {
		String str = "Welcome to India!! Hello India, This is a pleasant weather. What a great day ";
		// a - 10, e - 12

		char[] charArray = str.toLowerCase().replaceAll("\\s+", "").toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (Character c : charArray) {

			map.put(c, map.getOrDefault(c, 0) + 1);

		}

		for (Entry<Character, Integer> c : map.entrySet()) {

			System.out.println(c.getKey() + " " + c.getValue());




		}


	}

}
