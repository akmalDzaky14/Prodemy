package tutorial.kelasTerbuka.OOP_13;

class Display {
    static String type = "Display";
    private String name;

    Display(String name) {
        this.name = name;
    }

    void setType(String typeInput) {
        // type = typeInput //alternatif 1
        // this.type = typeInput //alternatif 2
        Display.type = typeInput; // alternatif 3
    }

    void show() {
        System.out.println("Display name: " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        // membuat object baru dan input data monitor dan smartphone
        Display display1 = new Display("Monitor");
        Display display2 = new Display("Smartphone");
        display1.show();
        display2.show();

        // tampilkan static variable atau class veriable original
        System.out.println("\nMenampilkan static variable");
        System.out.println(Display.type);
        // The static field Display.type should be accessed in a static way
        System.out.println(display1.type);
        System.out.println(display2.type);

        // kita coba mengganti veriable static-nya secara langsung
        Display.type = "Tampilan";
        // display1.type = "Tampilan"; hasilnya sama
        // display2.type = "Tampilan";

        System.out.println("\nMenampilkan static variable");
        System.out.println(Display.type);
        // The static field Display.type should be accessed in a static way
        System.out.println(display1.type);
        System.out.println(display2.type);

        // kita coba mengganti variabel staticnya dengan setter
        // display2.setType("Monitor"); hasilnya sama
        display1.setType("Monitor");

        System.out.println("\nMenampilkan static variable");
        System.out.println(Display.type);
        // The static field Display.type should be accessed in a static way
        System.out.println(display1.type);
        System.out.println(display2.type);
    }
}
