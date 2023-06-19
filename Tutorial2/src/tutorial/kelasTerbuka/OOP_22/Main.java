package tutorial.kelasTerbuka.OOP_22;
/*
 * File: Main.java
 * Project: OOP_22
 * File Created: Monday, 19th June 2023 8:05:14 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 9:02:40 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Tanjiro", 10, 100);
        HeroStrength hero2 = new HeroStrength("Luffy", 20, 100);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
    }
}
