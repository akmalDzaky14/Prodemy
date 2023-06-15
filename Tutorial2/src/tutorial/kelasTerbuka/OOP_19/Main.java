package tutorial.kelasTerbuka.OOP_19;
/*
 * File: Main.java
 * Project: OOP_19
 * File Created: Wednesday, 14th June 2023 3:02:54 pm
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Wednesday, 14th June 2023 3:03:12 pm
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        // hero1.defencePower() tidak punya
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Mountain Lady";
        hero2.defencePower = 100;
        hero2.display();
    }
}
