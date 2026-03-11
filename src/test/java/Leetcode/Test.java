package Leetcode;


public class Test {

	public static void main(String[] args) {
		Pyramid();
	}

	static void Pyramid() {
		int n = 100;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					System.out.print("*");
				} else {
					System.out.print("*");
				}
			}
			for (int j = i - 1; j >= 1; j--) {
				if (j == 1) {
					System.out.print("*");
				} else {
					System.out.print("*");
				}
			}
			// for (int k = 1; k <= 2 * i - 1; k++) {
			// if (k <= i) {
			// System.out.print(k);
			// } else {
			// System.out.print(2 * i - k);
			// }
			// }
			System.out.println();

		}

	}

}
