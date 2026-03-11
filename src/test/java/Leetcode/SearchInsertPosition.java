package Leetcode;

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {

		int start = 0;
		int mid = nums.length / 2;
		int end = nums.length - 1;
		while (start <= end) {
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		return start;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 6 };
		System.out.println(searchInsert(a, 1));

	}
}
