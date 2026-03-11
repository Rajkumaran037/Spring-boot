package Leetcode;


public class FindNumberswithEvenNumberofDigits {

	public static int findNumbers(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int count = 0;
			while (temp != 0) {
				temp = temp / 10;
				count++;
			}
			if (count % 2 == 0) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(findNumbers(new int[] { 555, 901, 482, 1771 }));
	}

}
