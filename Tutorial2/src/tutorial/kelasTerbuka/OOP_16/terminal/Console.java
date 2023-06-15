package tutorial.kelasTerbuka.OOP_16.terminal;

// Visibility semuanya
public class Console {
    public static void log(String message) {
        System.out.println(message);
    }
}

// ini hanya akan bisa diakses dari package
// tutorial.kelasTerbuka.OOP_16.terminal;
class Terminal {
    public static void log1(String message) {
        System.out.println(message);
    }
}
