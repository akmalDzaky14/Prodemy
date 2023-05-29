package tugas.Satu;

import java.util.Scanner;

public class Soal_4 {
	public static void main(String[] args) {
		int n;
		try (Scanner inputUser = new Scanner(System.in)) {
			System.out.print("Masukkan angka: ");
			n = inputUser.nextInt();
		}
		System.out.print("\n");
		Soal_2_C(n);
	}

	private static void Soal_2_C(int n) { // belum
		short x = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == j) || (i + j) == n - 1) {
					int ouput = tribonacci(x);
					System.out.print(ouput);
				} else {
					System.out.print("  ");
				}
				x++;
			}
			x = 0;
			System.out.println();

		}
	}

	public static int tribonacci(int n) {
		// Pola Simetris atau Palindromik dan Fibonacci dengan fungsi rekursif
		if (n == 0 || n == 1 || n == 2)
			return 1;
		else
			return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
	}
}