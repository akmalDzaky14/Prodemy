package tugas.Satu;
import java.util.*;

public class Soal_3 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Masukkan angka: ");
			int n = input.nextInt(); // Jumlah baris pola Fibonacci
			for (int i = 0; i < n; i++) {
				System.out.print(tribonacci(i) + " ");
			}
		}

	}

	public static int tribonacci(int n) {
		if (n == 0 || n == 1 || n == 2)
			return 1;
		else
			return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
	}

}
