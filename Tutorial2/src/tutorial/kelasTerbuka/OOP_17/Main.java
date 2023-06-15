package tutorial.kelasTerbuka.OOP_17;

public class Main {
    public static void main(String[] args) {
        // overloading pada constructor
        Player player1 = new Player("Saitama");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Hane");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // overloading method

        int a = Matematika.tambah(1, 19);
        System.out.println(a);
        double b = Matematika.tambah(1, 0.71);
        System.out.println(b);
    }
}
