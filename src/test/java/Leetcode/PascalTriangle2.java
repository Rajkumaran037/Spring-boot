package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

	public static List<Integer> getRow(int rowIndex) {


		if (rowIndex == 0) {
			return List.of(1);
		}
		List<List<Integer>> result = new ArrayList<>();
		result.add(List.of(1));
		for (int i = 1; i <= rowIndex; i++) {
			List<Integer> mid = new ArrayList<>();
			mid.add(1);
			List<Integer> previous = result.get(i - 1);
			for (int j = 0; j < i - 1; j++) {
				mid.add(previous.get(j) + previous.get(j + 1));
			}
			mid.add(1);
			result.add(mid);
		}
		return result.get(result.size() - 1);
	}

	public static void main(String[] args) {
		System.out.println(getRow(1));
	}

}
