package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int value = map.get(nums[i]);
				if (i - value <= k) {
					return true;
				}
				map.put(nums[i], i);
			} else {
				map.put(nums[i], i);
			}
		}
		return false;

	}

	public static void main(String[] args) {

		System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2));

	}
}
