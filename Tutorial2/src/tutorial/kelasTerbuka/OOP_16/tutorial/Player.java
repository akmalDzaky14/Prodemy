package tutorial.kelasTerbuka.OOP_16.tutorial;

import tutorial.kelasTerbuka.OOP_16.terminal.Console;

// Visibility default (tanpa public)
class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void show() {
        // System.out.println("Player: " + this.name);
        Console.log("Menggunakan Console");
        Console.log("Player name : " + this.name);
    }
}
