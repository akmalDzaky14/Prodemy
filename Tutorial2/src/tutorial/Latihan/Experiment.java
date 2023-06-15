package tutorial.Latihan;

/*
 * class Ayam {
 * String jenisAyam;
 * }
 * 
 * public class Experiment {
 * public static void main(String[] args) {
 * Ayam ayam1 = new Ayam();
 * ayam1.jenisAyam = "Kampung";
 * gantiNamaAyam(ayam1);
 * System.out.println(ayam1.jenisAyam);
 * }
 * 
 * public static void gantiNamaAyam(Ayam inputAyam) {
 * inputAyam = new Ayam();
 * inputAyam.jenisAyam = "Boiler";
 * }
 * }
 */
public class Experiment {
    // Java program to demonstrate execution
    // of static blocks and variables

    /*
     * Static variable dan block akan berjalan seketika di
     * deklarasikan.
     * Urutan jalan program :
     * 1. static int a = m1();
     * 2. static int m1() {return 20}
     * 3. static int a = m1();
     * 4. static {} (static block)
     * 5. main method
     */

    // static variable
    static int a = m1();

    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }

    static void m2() {
        System.out.println("m2");
    }

    // static method(main !!)
    public static void main(String[] args) {
        System.out.println("Value of a : " + a);
        System.out.println("from main");
    }

}
