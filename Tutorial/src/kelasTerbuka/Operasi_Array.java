package kelasTerbuka;

import java.util.Arrays;

public class Operasi_Array {

	public static void main(String[] args) {
		int[] arrayAngka1 = { 1, 2, 3, 4, 5 };

		// merubah array menjadi string
		System.out.println("\nMerubah array menjadi string\n==========");
		printArray(arrayAngka1);

		// Menyalin array
		System.out.println("\nMenyalin array\n==========");
		int[] arrayAngka2 = new int[5];
		printArray(arrayAngka1);
		printArray(arrayAngka2);

		System.out.println("\nMenyalin dengan loop");
		for (int i = 0; i < arrayAngka1.length; i++) {
			arrayAngka2[i] = arrayAngka1[i];
		}
		printArray(arrayAngka1);
		System.out.println(arrayAngka1);
		printArray(arrayAngka2);
		System.out.println(arrayAngka2);

		System.out.println("\nMenyalin dengan copyuOf");
		int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
	}

	private static void printArray(int[] dataArray) {
		System.out.println("array = " + Arrays.toString(dataArray));
	}

}
