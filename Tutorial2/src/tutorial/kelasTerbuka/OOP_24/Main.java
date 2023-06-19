package tutorial.kelasTerbuka.OOP_24;
/*
 * File: Main.java
 * Project: OOP_24
 * File Created: Monday, 19th June 2023 10:48:40 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 10:48:45 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

/*
         * visibility
         * 1. Public: Jika method atau attribute dalam public secara explisit,
         *      maka subclass tidak boleh mengurangi visibility
         * 2. Private: Jika method atau attribute dalam private secara explisit,
         *      maka subclass pun tidak dapat mengakses
         * 3. Final: method atau attribute dengan final keyword akan diwariskan,
         *      tetapi tidak bisa dioverride. dalam class yang sama bisa dioverload
         */

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup", 100);
        HeroIntel hero2 = new HeroIntel("Otong", 50);

        hero1.disply();
        hero2.disply();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.setHealth(120);
        hero2.setHealth(130);

        hero1.disply();
        hero2.disply();

        hero1.setHealth("reset");
        hero1.disply();

        hero2.setHealth("reset");
        hero2.disply();
    }
}
