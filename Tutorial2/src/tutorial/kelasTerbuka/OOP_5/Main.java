package tutorial.kelasTerbuka.OOP_5;

class Mahasiswa {
    // Data member
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // method tanpa return dan dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return dan tapi tidak ada parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message) {
        return "Hi, " + message + " saya adalah " + this.nama;
    }

}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Akmal", "201710370311223");

        // method
        mahasiswa.show();
        mahasiswa.setNama("Dzaky");
        System.out.println();
        mahasiswa.show();

        System.out.println();
        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getNIM());

        System.out.println();
        String data = mahasiswa.sayHi("Annisa");
        System.out.println(data);
    }
}
