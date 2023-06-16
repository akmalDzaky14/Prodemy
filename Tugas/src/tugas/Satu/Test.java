package tugas.Satu;

import java.util.Iterator;

public class Test {
//Soal_2_C
	public static void main(String[] args) {
		Soal_1_D(9);
		System.out.println("\n");
	}

	private static void Soal_1_D(int n) {
		int k = (n / 2) + 1;
		int[] a;
		int x = 1, hasil = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// kiri atas ke kanan bawah
				if ((i == j)) {
					// bagian pertama perulangan, sampai nilai k
					for (int l = 1; l <= k; l++) {
						hasil = B2(l);
						System.out.print(hasil + " ");
					}
					// bagian kedua perulangan mundur, dari k-1 hingga 0

				}
				// kanan atas ke kiri bawah
//				else if ((i + j) == n - 1) {
//					// bagian pertama perulangan, sampai nilai k
//					hasil = B2(x);
//					System.out.print(hasil + " ");
//					// bagian kedua perulangan mundur, dari k-1 hingga 0
//				} 
				else {
					System.out.print("  ");
				}
				x++;
			}
			x = 1;
			System.out.println();

		}
	}

	private static int B2(int n) {
		// B2 dengan fungsi rekursif
		if (n == 0 || n == 1)
			return 1;
		else
			return B2(n - 1) + B2(n - 2);
	}
}
