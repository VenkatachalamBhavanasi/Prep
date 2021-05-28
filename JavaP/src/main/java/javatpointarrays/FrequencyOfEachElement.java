package javatpointarrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class FrequencyOfEachElement {

	@Test
	public void example() {

		int[] nums = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		frequencyOfEachElement(nums);

	}

	private void frequencyOfEachElement(int[] nums) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {


			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

		}


		for (Entry<Integer, Integer> k : map.entrySet()) {
			System.out.println(k.getKey() + " = " + k.getValue());

		}

	}

}
