package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle1 {

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<>();
		if (numRows == 0) {
			return result;
		}
		List<Integer> first = new ArrayList<>();
		first.add(1);
		result.add(first);
		if (numRows == 1) {
			return result;
		}

		for (int i = 1; i < numRows; i++) {
			List<Integer> mid = new ArrayList<>();
			mid.add(1);
			List<Integer> previous = result.get(i - 1);
			for (int j = 0; j < i - 1; j++) {
				mid.add(previous.get(j) + previous.get(j + 1));
			}
			mid.add(1);
			result.add(mid);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(generate(5));
	}

}
