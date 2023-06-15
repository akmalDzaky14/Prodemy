package tutorial.kelasTerbuka.OOP_16.tutorial;

// import class console dari package/folder berbeda
import tutorial.kelasTerbuka.OOP_16.terminal.Console;
// hanya import static method dari class console
import static tutorial.kelasTerbuka.OOP_16.terminal.Console.log;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Otong");
        player1.show();

        Console.log("Menampilkan data dengan console.log");
        Console.log(player1.getName());

        log("Menampilkan data dengan log saja");
        log(player1.getName());
    }
}

/*
 * penggunaan private class tidak di perkenankan, Error:
 * Illegal modifier for the class Test; only public, abstract & final are
 * permitted
 * private class Test{
 * }
 */
