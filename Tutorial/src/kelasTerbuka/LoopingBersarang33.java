package kelasTerbuka;

public class LoopingBersarang33 {

	public static void main(String[] args) {
		// Looping Bersarang

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					break;
				}
				System.out.print("* " + i + " " + j);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
				if ((i + j) == 4) {
					break;
				}
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("* ");
				if (i == j) {
					break;
				} else if ((i + j) == 8) {
					break;
				} else if ((i + j) == 8) {
					break;
				}
			}
			System.out.println();
		}

		System.out.println();

		int n = 9; // Jumlah baris ketupat

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();

		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
