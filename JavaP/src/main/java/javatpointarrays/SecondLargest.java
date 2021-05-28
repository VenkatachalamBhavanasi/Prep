package javatpointarrays;

import org.junit.Test;

public class SecondLargest {

	@Test
	public void example() {

		int nums[] = { 13,67,88,65,13,95,67,65,87,95,99,99};
		secondLargest(nums);

	}

	private void secondLargest(int[] nums) {
		// TODO Auto-generated method stub

		int fMax= Integer.MIN_VALUE;
		int sMax =Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i]>fMax) {
				sMax=fMax;
				fMax=nums[i];

			}

			else {

			}



		}
		System.out.println(sMax);

	}

}
