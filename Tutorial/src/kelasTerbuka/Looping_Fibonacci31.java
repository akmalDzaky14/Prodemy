package kelasTerbuka;

import java.util.*;

public class Looping_Fibonacci31 {

	public static void main(String[] args) {

		// Menghitung nilai fibonnaci ke-n
		int n, f_n, f_n_1, f_n_2;

		try (Scanner inputUser = new Scanner(System.in)) {
			System.out.print("mengambil nilai fibonnaci ke - :");
			n = inputUser.nextInt();
		}

		System.out.println("=====FOR");
		f_n_2 = 0;
		f_n_1 = 1;
		f_n = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println("nilai ke - " + i + " adalah " + f_n);
			f_n = f_n_1 + f_n_2;
			f_n_2 = f_n_1;
			f_n_1 = f_n;
		}

		System.out.println("=====WHILE");
		f_n_2 = 0;
		f_n_1 = 1;
		f_n = 1;
		int i = 1;
		while (i <= n) {
			System.out.println("nilai ke - " + i + " adalah " + f_n);
			f_n = f_n_1 + f_n_2;
			f_n_2 = f_n_1;
			f_n_1 = f_n;
			i++;
		}

		System.out.println("=====DO WHILE");
		f_n_2 = 0;
		f_n_1 = 1;
		f_n = 1;
		i = 1;
		do {
			System.out.println("nilai ke - " + i + " adalah " + f_n);
			f_n = f_n_1 + f_n_2;
			f_n_2 = f_n_1;
			f_n_1 = f_n;
			i++;
		} while (i <= n);
	}

}
