package tugas.Satu;

public class Test {
//Soal_2_C
	public static void main(String[] args) {
		Soal_1_D(9);
		System.out.println("\n");
	}

	private static void Soal_1_D(int n) {
		int x = 1, hasil = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == j)) {
					hasil = B2(x);
					System.out.print(hasil + " ");
					if(x==5) {
						
					}
				} else if ((i + j) == n - 1) {
					hasil = B2(x);
					System.out.print(hasil + " ");
				} else {
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
