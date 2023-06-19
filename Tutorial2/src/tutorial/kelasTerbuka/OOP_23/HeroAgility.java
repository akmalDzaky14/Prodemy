package tutorial.kelasTerbuka.OOP_23;
/*
 * File: HeroAagility.java
 * Project: OOP_23
 * File Created: Monday, 19th June 2023 9:32:52 am
 * Author: Akmal Dzaky H (akmaldzaky33@gmail.com)
 * -----
 * Last Modified: Monday, 19th June 2023 9:32:55 am
 * Modified By: Akmal Dzaky H (akmaldzaky33@gmail.com>)
 * -----
 * Copyright (c) 2023 PT. Pro Sigmaka Mandiri
 */

public class HeroAgility extends Hero {
    String type = "Agility";

    HeroAgility(String name) {
        super(name);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type " + this.type);
    }

    void showoff() {
        System.out.println("Saya adalah hero Agility");
    }
}
