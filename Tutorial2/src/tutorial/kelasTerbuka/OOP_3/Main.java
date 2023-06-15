package tutorial.kelasTerbuka.OOP_3;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa();

        mahasiswa1.nama = "akmal";
        mahasiswa1.nim = "201710370311223";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.ipk = 3.53;
        mahasiswa1.umur = 22;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.umur);
    }
}
