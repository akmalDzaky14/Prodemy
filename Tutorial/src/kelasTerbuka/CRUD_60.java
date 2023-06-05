package kelasTerbuka;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class CRUD_60 {

	public static void main(String[] args) throws IOException {
		
		Scanner terminalInput = new Scanner(System.in);
		String pilihanUser;
		boolean isLanjutan = true;

		while (isLanjutan) {
			clearScreen();
			System.out.println("Database Perpustakaan\n");
			System.out.println("1.\tLihat seluruh buku");
			System.out.println("2.\tCari data buku");
			System.out.println("3.\tTambah data buku");
			System.out.println("4.\tUbah data buku");
			System.out.println("5.\tHapus data buku");

			System.out.print("\n\nPilihan anda: ");
			pilihanUser = terminalInput.next();

			switch (pilihanUser) {
			case "1":
				System.out.println("\n=================");
				System.out.println("LIST SELURUH BUKU");
				System.out.println("=================");
				tampilkanData();
				break;
			case "2":
				System.out.println("\n=========");
				System.out.println("CARI BUKU");
				System.out.println("=========");
				// cari data
				break;
			case "3":
				System.out.println("\n================");
				System.out.println("TAMBAH DATA BUKU");
				System.out.println("================");
				// tambah data
				break;
			case "4":
				System.out.println("\n==============");
				System.out.println("UBAH DATA BUKU");
				System.out.println("==============");
				// ubah data
				break;
			case "5":
				System.out.println("\n===============");
				System.out.println("HAPUS DATA BUKU");
				System.out.println("===============");
				// hapus data
				break;
			default:
				System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-5]");
			}
			isLanjutan = getYesorNo("Apakah Anda ingin melanjutkan?");
		}

	}

	public static void tampilkanData() throws IOException {
		System.out.println("kita akan menampilkan data disini brader");
		boolean isTambah = getYesorNo("Apakah Anda ingin melanjutkan?");
	}

	public static boolean getYesorNo(String message) {
		Scanner terminalInput = new Scanner(System.in);
		System.out.print("\n" + message + " (y/n)? ");
		String pilihanUser = terminalInput.next();

		while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
			System.err.println("Pilihan anda bukan y atau n");
			System.out.print("\n" + message + " (y/n)? ");
			pilihanUser = terminalInput.next();
		}

		return pilihanUser.equalsIgnoreCase("y");
	}

	public static void clearScreen() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.println("\033\143");
			}
		} catch (Exception ex) {
			System.err.println("Tidak bisa clear screen");
		}
	}
}
