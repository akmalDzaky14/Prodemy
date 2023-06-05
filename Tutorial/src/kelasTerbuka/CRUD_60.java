package kelasTerbuka;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

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
				cariData();
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

	public static void cariData() throws IOException {
		// membaca database ada atau tidak

		try {
			File file = new File("./database.txt");
		} catch (Exception e) {
			System.err.println("Database tidak ditemukan!");
			System.err.println("Silahkan tambahkan terlebihdahulu");
			return;
		}

		// ambil keyword dari user

		Scanner terminalInput = new Scanner(System.in);
		System.out.println("Masukkan kata kunci untuk mencari buku: ");
		String cariString = terminalInput.nextLine();
		String[] keyword = cariString.split("\\s+");

		// cek keyword di database
		cekBukuDiDatabase(keyword);
	}

	public static void cekBukuDiDatabase(String[] keywords) throws IOException {
		FileReader fileInput = new FileReader("./database.txt");
		BufferedReader bufferInput = new BufferedReader(fileInput);

		String data = bufferInput.readLine();
		boolean isExist;
		int nomorData = 0;
		System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		while (data != null) {
			// cek keywords di dalam baris
			isExist = true;

			for (String keyword : keywords) {
				isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
			}

			// jika keywordsnya cocok maka tampilkan

			if (isExist) {
				nomorData++;
				StringTokenizer stringToken = new StringTokenizer(data, ",");

				stringToken.nextToken();
				System.out.printf("| %2d ", nomorData);
				System.out.printf("|\t%4s  ", stringToken.nextToken());
				System.out.printf("|\t%-20s   ", stringToken.nextToken());
				System.out.printf("|\t%-20s   ", stringToken.nextToken());
				System.out.printf("|\t%s   ", stringToken.nextToken());
				System.out.print("\n");
			}
			data = bufferInput.readLine();
		}
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");

	}

	public static void tampilkanData() throws IOException {

		FileReader fileInput;
		BufferedReader bufferInput;

		try {
			fileInput = new FileReader("./database.txt");
			bufferInput = new BufferedReader(fileInput);
		} catch (Exception e) {
			System.err.println("Database Tidak ditemukan");
			System.err.println("Silahkan tambah data terlebih dahulu");
			return;
		}

		System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");

		String data = bufferInput.readLine();
		int nomorData = 0;
		while (data != null) {
			nomorData++;

			StringTokenizer stringToken = new StringTokenizer(data, ",");
			System.out.printf("| %2d ", nomorData);
			System.out.printf("|\t%4s  ", stringToken.nextToken());
			System.out.printf("|\t%-20s   ", stringToken.nextToken());
			System.out.printf("|\t%-20s   ", stringToken.nextToken());
			System.out.printf("|\t%s   ", stringToken.nextToken());
			System.out.println("\n");

			data = bufferInput.readLine();
		}
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
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
