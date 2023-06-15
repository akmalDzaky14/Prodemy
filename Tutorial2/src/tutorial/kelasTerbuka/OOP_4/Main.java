package tutorial.kelasTerbuka.OOP_4;

//class tanpa costructor / class polos
class Polos {
    String dataString;
    int dataInt;
}

// class dengan constructor
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    /*
     * constructor adalah sebuah method atau sebuah prosedur yang akan dipanggil
     * saat pertama kali kita membuat object.
     * 
     * contoh constructor tanpa paramater :
     * Mahasiswa(){
     * System.out.println("ini adalah constructor");
     * }
     */

    // constructor dengan paramater
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        nim = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // Mahasiswa_OOP_04 Mahasiswa1 = new Mahasiswa_OOP_04("Akmal","201710370311223",
        // "Informatika");
        new Mahasiswa("Akmal", "201710370311223", "Informatika");

        /*
         * Polos objectPolos = new Polos();
         * objectPolos.dataString = "polos";
         * objectPolos.dataInteger = 0;
         * 
         * System.out.println(objectPolos.dataString);
         * System.out.println(objectPolos.dataInteger);
         */
    }

}