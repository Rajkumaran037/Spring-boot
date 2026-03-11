package Leetcode;

public class MedianofTwoSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length == 0 && nums2.length == 0) {
			return 0;
		}
		int m = 0;
		int n = 0;
		int[] result = new int[nums1.length + nums2.length];
		int index=0;
		while (m < nums1.length && n < nums2.length) {
			if (nums1[m] <= nums2[n]) {
				result[index++] = nums1[m++];
			} else {
				result[index++] = nums2[n++];
			}
		}
		while (m < nums1.length) {
			result[index++] = nums1[m++];
		}
		while (n < nums2.length) {
			result[index++] = nums2[n++];
		}
		
		
		if (result.length % 2 == 1) { // odd length
			return result[result.length / 2];
		} else { // even length
			return (result[result.length / 2] + result[result.length / 2 - 1]) / 2.0;
		}
	}

	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] { 1 }, new int[] {}));
	}

}
