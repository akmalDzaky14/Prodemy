package tugas.Dua;

import java.lang.String;
import java.util.Scanner;

public class Soal_1 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("============Menu============");
			System.out.println("1. Right Padding\n2. Left Padding\n");
			System.out.print("Pilihan: ");
			Scanner menu = new Scanner(System.in);
			int pilihan = menu.nextInt();
			switch (pilihan) {
			case 1: {
				System.out.print("\nMasukkan kata: ");
				StringBuilder builder = new StringBuilder(scan.next());
				System.out.print("Masukkan angka: ");
				int input2 = scan.nextInt();
				rightPadding(builder, input2);
				menu.close();
				break;
			}
			case 2: {
				System.out.print("\nMasukkan kata: ");
				StringBuilder builder = new StringBuilder(scan.next());
				System.out.print("Masukkan angka: ");
				int input2 = scan.nextInt();
				leftPadding(builder, input2);
				menu.close();
				break;
			}
			default:
				menu.close();
				throw new IllegalArgumentException("Unexpected value: " + pilihan);
			}

		}
	}

	private static void rightPadding(StringBuilder kata, int panjang) {
		String space = "";
		if (panjang > kata.length()) {
			for (int i = 0; i < panjang - kata.length(); i++) {
				space += " _ ";
			}
			kata.append(space);
			System.out.println("\n" + kata);
		} else if (panjang == kata.length()) {
			System.out.println("\n" + kata);
		} else {

			System.out.println("\nPanjang harus lebih dari kata");
		}

	}

	private static void leftPadding(StringBuilder kata, int panjang) {
		String space = "";
		if (panjang > kata.length()) {
			for (int i = 0; i < panjang - kata.length(); i++) {
				space += " _ ";
			}
			kata.insert(0, space);
			System.out.println("\n" + kata);
		} else if (panjang == kata.length()) {
			System.out.println("\n" + kata);
		} else {

			System.out.println("\nPanjang harus lebih dari kata");
		}
	}

//	private static void leftPadding(String kata, int panjang) {
//	String buffer = "";
//	String space = "";
//	if (panjang > kata.length()) {
//		for (int i = 0; i < panjang - kata.length(); i++) {
//			space += " _ ";
//			buffer = kata + space;
//		}
//	} else if (panjang < kata.length()) {
//		buffer = kata.substring(0, panjang);
//
//	} else {
//		System.out.println(kata);
//	}
//	System.out.println(buffer);
//}
//
//private static void rightPadding(String kata, int panjang) {
//	String buffer = "";
//	String space = "";
//	if (panjang > kata.length()) {
//		for (int i = 0; i < panjang - kata.length(); i++) {
//			space += " _ ";
//			buffer = space + kata;
//		}
//	} else if (panjang < kata.length()) {
//		buffer = kata.substring(0, panjang);
//
//	} else {
//		System.out.println(kata);
//	}
//	System.out.println(buffer);
//}
}
