package tutorial.Latihan.Evaluasi_01;

import java.util.Scanner;

class Resut {
    public static int coklat(int n, int c, int m) {
        /*
         * n = jumlah uang yang dimiliki
         * c = harga coklat
         * m = promo tersedia
         */
        int hasil = 0;
        int beli = n / c;
        // coklat yang didapatkan setelah membeli
        hasil += beli;

        int bungkus = beli;
        // menghitung jumlah colkat gratis berdasarkan coklat yang di beli
        while (bungkus >= m) {
            // menghitung coklat gratis yang didapatkan
            int coklatGratis = bungkus / m;
            // menambahkan coklat gratis dengan coklat yang dibeli
            hasil += coklatGratis;
            // menghitung sisa bungkus yang tersedia
            bungkus = bungkus - coklatGratis * m + coklatGratis;
        }

        return hasil;
    }
}

public class Soal_2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah kasus\t: ");
        int inputKasus = in.nextInt();
        for (int i = 1; i <= inputKasus; i++) {
            int inputUang = in.nextInt();
            int inputHarga = in.nextInt();
            int inputPromo = in.nextInt();

            int jumlah = Resut.coklat(inputUang, inputHarga, inputPromo);
            System.out.println("Jumlah coklat pada kasus ke-" + i + " adalah\t: " + jumlah);
        }
        in.close();
    }
}
