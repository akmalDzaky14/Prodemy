package tutorial.kelasTerbuka.OOP_18;
/*
 * File: Main.java
 * Project: OOP_18
 * File Created: Wednesday, 14th June 2023 5:46:20 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Wednesday, 14th June 2023 3:03:37 pm
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

// inheritance adalah hubungan is-a
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Ucup";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Asep";
        hero2.display();

        HeroIntellegent hero3 = new HeroIntellegent();
        hero3.name = "Bagas";
        hero3.display();
    }
}
