package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0) {
			return 0;
		}
		Set<Character> set = new HashSet<>();
		int max = 1;
		int left = 0;
		for (int i = 0; i < s.length(); i++) {
			if (set.add(s.charAt(i))) {
				max = Math.max(max, set.size());
				continue;
			}
			else {
				max = Math.max(max, set.size());
				i = ++left;
				set.clear();
				set.add(s.charAt(i));
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aab"));
	}

}
