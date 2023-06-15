package tutorial.kelasTerbuka.OOP_20;
/*
 * File: Main.java
 * Project: OOP_20
 * File Created: Wednesday, 14th June 2023 3:48:40 pm
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Wednesday, 14th June 2023 3:48:42 pm
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        HeroStrength hero2 = new HeroStrength();

        hero1.display();
        hero2.display();
        hero2.displaySuper();
    }
}
