package kelasTerbuka;

import java.util.Arrays;

public class Advance_Array42 {

	public static void main(String[] args) {
		int[] arrayAngka1 = { 1, 2, 3, 4, 5 };
		int[] arrayAngka2 = new int[5];

		//ketika dijalankan perintah berikut, system akan menyalin address array
		// Bukan value dari array
		arrayAngka2 = arrayAngka1;

		System.out.println("Array 1 = " + Arrays.toString(arrayAngka1));
		System.out.println("Array 2 = " + Arrays.toString(arrayAngka2));

		//Sehingga, ketika salah satu array diubah akan terjadi perubahan pada
		// Array lainnya
		arrayAngka1[0] = 400;
		arrayAngka2[2] = 100;

		System.out.println("Array 1 = " + Arrays.toString(arrayAngka1));
		System.out.println("Array 2 = " + Arrays.toString(arrayAngka2));

		//Hal ini juga berlaku pada method, karena pada int[] dataArray method menggunakan
		// Argumen pass by reference, bukan pass by value seperti int dataArray
		ubahArray(arrayAngka1);

		System.out.println("Array 1 = " + Arrays.toString(arrayAngka1));
		System.out.println("Array 2 = " + Arrays.toString(arrayAngka2));
	}

	private static void ubahArray(int[] dataArray) {
		dataArray[0] = 125;
	}

}
