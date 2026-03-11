package Leetcode;

import java.util.Arrays;

public class RemoveDuplicate {

	public static int removeDuplicates(int[] nums) {

		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[result] == nums[i]) {
				continue;
			}
			nums[++result] = nums[i];
		}
		return result + 1;
	}

	public static void main(String[] args) {

		int[] a = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(a));
		System.out.println(Arrays.toString(a));

	}

}
