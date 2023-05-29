package kelasTerbuka;

import java.util.Scanner;

public class OperatorLogika19 {

	public static void main(String[] args) {
		// ======Operasi logika boolean

		try (// Membuat sebuah objek untuk menangkap input dari use
		Scanner inputUser = new Scanner(System.in)) {
			// program sederhana untuk menebak angka
			int nilaiBenar, nilaiTebakan;
			boolean statusTebakan;

			nilaiBenar = 6;
			System.out.print("Masukkan nilai tebakkan: ");
			nilaiTebakan = inputUser.nextInt();
			System.out.println("nilai tebakakan andan adalah: " + nilaiTebakan);

			// Operasi logika
			statusTebakan = (nilaiBenar == nilaiTebakan);
			System.out.println("Tebakkan anda adalah: " + statusTebakan);

			// Operasi aljabar boolena (and / or)

			System.out.print("Masuikkan nilai tebakkan: ");
			nilaiTebakan = inputUser.nextInt();

			statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
			System.out.println("Tebakkan anda adalah: " + statusTebakan);
		}
	}

}
