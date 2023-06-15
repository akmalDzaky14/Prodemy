package tutorial.kelasTerbuka.OOP_14;

import java.util.ArrayList;

class Player {

    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    // deklarasi static variable
    static int a = 10;

    // mambuat method default dang menggunakan variable static
    void showStaticA() {
        // tidak bisa di print karena a adalah static, method harus static juga
        System.out.println(Player.a);
    }

    Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    public void show() {
        System.out.println("Nama Player : " + this.name);
    }

    // static method
    static void showNumberOfPlayer() {
        System.out.println("Jumlah Player : " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames() {
        return Player.nameList;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2 ");
        Player player3 = new Player("Player 3 ");
        Player player4 = new Player("Player 4 ");

        Player.showNumberOfPlayer();

        System.out.println("Nama = " + Player.getNames());
        // System.out.println("Nama = " + player1.getNames()); // ini bisa dilakukan

        /*
         * Player.coba();
         * Error : Cannot make a static reference to the non-static
         * method coba() from the type Player
         */
    }
}
