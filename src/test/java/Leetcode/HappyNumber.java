package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static boolean isHappy(int n) {

		if (n == 1) {
			return true;
		}
		Set<Integer> set = new HashSet<>();
		while (n != 1) {
			int result = 0;
			while (n != 0) {
				int sum = n % 10;
				n = n / 10;
				result = result + sum * sum;
			}
			n = result;
			if (result == 1) {
				return true;
			} else if (!set.add(result)) {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {



	}
}
