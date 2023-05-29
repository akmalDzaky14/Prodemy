package tugas.Satu;

import java.util.*;

public class Soal_1 {

	public static void main(String[] args) {
		try (Scanner inputAngka = new Scanner(System.in)) {
			System.out.print("Masukkan angka: ");
			int angka = inputAngka.nextInt();
			System.out.println();
			Soal_1_A(angka);
			System.out.println();
			Soal_1_B(angka);
			System.out.println();
			Soal_1_C(angka);
			System.out.println();
			Soal_1_D(angka);
		}

	}

	private static void Soal_1_A(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void Soal_1_B(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == j) || (i + j) == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	private static void Soal_1_C(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void Soal_1_D(int n) {
		short x = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == j) || (i + j) == n - 1) {
					tampilkanGanjilKeN(x);

				} else {
					System.out.print("  ");
				}
				x++;
			}
			x = 1;
			System.out.println();

		}
	}

	public static void tampilkanGanjilKeN(int n) {
		int bilangan = 1;
		for (int i = 1; i <= n; i++) {
			if (i == n) {
				System.out.print(bilangan);
			}
			bilangan += 2;
		}
	}

}
