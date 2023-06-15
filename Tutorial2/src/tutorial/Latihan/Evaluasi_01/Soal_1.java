package tutorial.Latihan.Evaluasi_01;

import java.util.Scanner;

public class Soal_1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan panjang array dan nilai d\t: ");
        int panjangArr = in.nextInt();
        int d = in.nextInt();
        int[] dataArray = new int[panjangArr];
        // isi data array
        System.err.print("Silahkan isi data array\t: ");
        for (int i = 0; i < panjangArr; i++) {
            dataArray[i] = in.nextInt();
        }
        int jawaban = Hasil(d, dataArray);
        System.out.print("\njumlah kondisi yang memenuhi nilai d adalah\t: " + jawaban);
        in.close();
    }

    static int Hasil(int d, int[] Arr) {
        int x = 0;
        // memanggil nilai array i dari 0 hingga array-2
        // karena array j dan k menggunakannya
        for (var i = 0; i < Arr.length - 2; i++) {
            // memanggil nilai array j dari sepanjang array
            for (var j = i + 1; j < Arr.length - 1; j++) {
                // menghitung apakah nilai arr[j] - arr[i] = d
                if (Arr[j] - Arr[i] != d) {
                    continue;
                }

                for (var k = j + 1; k < Arr.length; k++) {
                    if (Arr[k] - Arr[j] != d) {
                        continue;
                    }

                    x++;
                }
            }
        }
        return x;
    }
}
