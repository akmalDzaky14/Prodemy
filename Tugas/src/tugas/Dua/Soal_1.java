package tugas.Dua;

import java.lang.String;
import java.util.Scanner;

public class Soal_1 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Masukkan kata: ");
			String input1 = scan.next();
			System.out.print("Masukkan angka: ");
			int input2 = scan.nextInt();
			leftPadding(input1, input2);
			rightPadding(input1, input2);
		}
	}

	private static void leftPadding(String kata, int panjang) {
		String buffer = "";
		String space = "";
		if (panjang > kata.length()) {
			for (int i = 0; i < panjang - kata.length(); i++) {
				space += "_";
				buffer = kata + space;
			}
		} else if (panjang < kata.length()) {
			buffer = kata.substring(0, panjang);

		} else {
			System.out.println(kata);
		}
		System.out.println(buffer);
	}

	private static void rightPadding(String kata, int panjang) {
		String buffer = "";
		String space = "";
		if (panjang > kata.length()) {
			for (int i = 0; i < panjang - kata.length(); i++) {
				space += "_";
				buffer = space + kata;
			}
		} else if (panjang < kata.length()) {
			buffer = kata.substring(0, panjang);

		} else {
			System.out.println(kata);
		}
		System.out.println(buffer);
	}

}
