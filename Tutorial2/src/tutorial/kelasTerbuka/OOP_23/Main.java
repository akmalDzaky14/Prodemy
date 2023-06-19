package tutorial.kelasTerbuka.OOP_23;
/*
 * File: Main.java
 * Project: OOP_23
 * File Created: Monday, 19th June 2023 9:08:47 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 9:09:23 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup");
        HeroStrength hero2 = new HeroStrength("Otong");
        hero1.display();
        hero2.display();

        // Plymorphic
        Hero hero3 = new HeroAgility("Maria");
        hero3.display();
        /*
         * hero3.showoff(); //Tidak bisa
         * karena di sub class dan superclass tidak ada method showoff
         */

        HeroAgility hero4 = new HeroAgility("Mahmud");
        hero4.display();
        hero4.showoff();

        /*
         * HeroIntel hero4 = new Hero("Mahmud"); //Tidak Bisa
         * karena class hero belum pasti hero intel
         * tapi class hero intel sudah pasti hero
         * hero4.display
         */

        // Array List
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4; // casting, di ubah dari heroAgility menjadi Hero

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();
        kumpulanHero[3].display();

        /*
         * method calls
         * kumpulanHero[3].showoff(); //Tidak bisa
         * karena di anggap sebagai class hero
         * dan di superclass tidak ada method showoff
         * walaupun di subclass hero4 ada
         * HARUS MENGGUNAKAN hero4.showoff();
         */

        // aplikasi
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);
    }
}
