package tugas.Satu;

//import java.util.Scanner;

public class Soal_2 {

	public static void main(String[] args) {
//		int n;
//		try (Scanner inputUser = new Scanner(System.in)) {
//			System.out.print("mengambil nilai fibonnaci ke - :");
//			n = inputUser.nextInt();
//		}
		System.out.println("Fibonacci:");
		Soal_2_A(11);
		System.out.println("\nPola Simetris:");
		Soal_2_B_1(11);
		System.out.println("\nDeret Fibonacci dan Pola Simetris:");
		Soal_2_B_2(9);
		System.out.println("\nDeret Fibonacci dan Array:\n(Hanya bisa untuk Input 9)");
		Soal_2_C(9);

	}

	public static void Soal_2_A(int n) {
		// Deret Fibonnaci
		for (int i = 0; i < n; i++) {
			int fib = Fibonnaci(i);
			System.out.print(fib + " ");
		}
	}

	public static void Soal_2_B_1(int n) {
		// Pola Simetris atau Palindromik
		if ((n % 2) == 0) {
			System.out.println("Angka Harus Ganjil");
		} else {
			int x = (n / 2) + 1;
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " ");
			}
			for (int y = x - 1; y >= 1; y--) {
				System.out.print(y + " ");
			}
		}
	}

	public static void Soal_2_B_2(int n) {
		int j = (n / 2) + 1;
		if ((n % 2) == 0 || n <= 3) {
			System.out.print("Nilai harus ganjil dan lebih dari 3");
		} else {
			// bagian pertama
			for (int i = 0; i < j; i++) {
				int fib = Fibonnaci(i);
				System.out.print(fib + " ");
			}
			// bagian kedua
			for (int i = j - 2; i >= 0; i--) {
				int fib = Fibonnaci(i);
				System.out.print(fib + " ");
			}
		}
	}

	// Hanya bisa untuk Input 9
	private static void Soal_2_C(int n) { 
		int x = 0;
		int z = 3;
		if ((n % 2) == 0 || n <= 3) {
			System.out.print("Nilai harus ganjil dan lebih dari 3");
		} else {
			for (int i = 0; i < n; i++) {
				if (x <= 4) {
					for (int j = 0; j < n; j++) {
						if ((i == j) || (i + j) == (n - 1)) {
							int ouput = Fibonnaci(x);
							System.out.print(ouput);
						} else {
							System.out.print("  ");
						}
					}
				}
				x++;
				if (x >= 6) {
					for (int j = 0; j < n; j++) {
						if ((i + j) == (n - 1) || (i == j)) {
//							System.out.print(x);
							int ouput = Fibonnaci(x-z);
							System.out.print(ouput);
						} else {
							System.out.print("  ");
						}
					}
					z += 2;
				}
				System.out.println();
			}
		}
	}

	public static int Fibonnaci(int n) {
		// Pola Simetris atau Palindromik dan Fibonacci dengan fungsi rekursif
		if (n == 0 || n == 1)
			return 1;
		else
			return Fibonnaci(n - 1) + Fibonnaci(n - 2);
	}
}
