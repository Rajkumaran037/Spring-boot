package Leetcode;

import java.util.Arrays;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[result] = nums[i];
			if (nums[result] != val) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(removeElement(a, 2));
		System.out.println(Arrays.toString(a));

	}

}
